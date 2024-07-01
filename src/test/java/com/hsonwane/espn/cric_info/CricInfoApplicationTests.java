package com.hsonwane.espn.cric_info;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hsonwane.espn.cric_info.dto.PlayerDetails;
import com.hsonwane.espn.cric_info.repo.PlayerDetailsRepository;
import com.hsonwane.espn.cric_info.service.PlayerDeatilsService;
import com.hsonwane.espn.cric_info.service.PlayerDetailsServiceImpl;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DataJpaTest
class CricInfoApplicationTests {

    @Autowired
    private PlayerDetailsRepository playerRepository;

    private PlayerDeatilsService playerService;

    @BeforeEach
    public void setUp() {
        playerService = new PlayerDetailsServiceImpl(playerRepository);
        // Add some sample players for testing
        playerService.addPlayer(new PlayerDetails("Virat Kohli", "Virat", "India"));
        playerService.addPlayer(new PlayerDetails("Shane Warne", "Warne", "Australia"));
    }

    @Test
    public void testGetAllPlayersByTeamName() {
        assertEquals(1, playerService.getAllPlayersByTeamName("India").size());
    }

    @Test
    public void testGetPlayerById() {
        PlayerDetails player = playerService.getPlayerById(1L);
        assertNotNull(player);
        assertEquals("Virat Kohli", player.getLongName());
    }

    @Test
    public void testAddPlayer() {
        PlayerDetails newPlayer = new PlayerDetails("Kane Williamson", "Williamson", "New Zealand");
        playerService.addPlayer(newPlayer);
        assertEquals(3, playerService.getAllPlayers().size());
        assertNotNull(newPlayer.getPlayerId());
    }

    @Test
    public void testUpdatePlayer() {
    	PlayerDetails player = playerService.getPlayerById(2L);
        assertNotNull(player);
        player.setShortName("Shane W");
        playerService.updatePlayer(2L, player);
        assertEquals("Shane W", playerService.getPlayerById(2L).getShortName());
    }

    @Test
    public void testDeletePlayer() {
        playerService.deletePlayer(1L);
        assertEquals(1, playerService.getAllPlayers().size());
    }
}