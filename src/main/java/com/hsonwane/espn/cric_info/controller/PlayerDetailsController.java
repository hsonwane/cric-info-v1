package com.hsonwane.espn.cric_info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsonwane.espn.cric_info.dto.PlayerDetails;
import com.hsonwane.espn.cric_info.service.PlayerDeatilsService;

@RestController
@RequestMapping("/api/players")
public class PlayerDetailsController {
	
	@Autowired
	private PlayerDeatilsService playerDetailsService;
	
	@GetMapping("/{teamName}")
    public List<PlayerDetails> getAllPlayers(@PathVariable String teamName) {
        return playerDetailsService.getAllPlayersByTeamName(teamName);
    }

    @GetMapping("/{id}")
    public PlayerDetails getPlayerById(@PathVariable("id") Long playerId) {
        return playerDetailsService.getPlayerById(playerId);
    }

    @PostMapping
    public PlayerDetails addPlayer(@RequestBody PlayerDetails player) {
        return playerDetailsService.addPlayer(player);
    }

    @PutMapping("/{id}")
    public PlayerDetails updatePlayer(@PathVariable("id") Long playerId, @RequestBody PlayerDetails player) {
        return playerDetailsService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable("id") Long playerId) {
    	playerDetailsService.deletePlayer(playerId);
    }

	
}
