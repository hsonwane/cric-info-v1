package com.hsonwane.espn.cric_info.service;

import java.util.List;

import com.hsonwane.espn.cric_info.dto.PlayerDetails;

/**
 * @author hsonwane
 *
 */
public interface PlayerDeatilsService {

	    List<PlayerDetails> getAllPlayersByTeamName(String teamName);
	    
	    List<PlayerDetails> getAllPlayers();
	    
	    PlayerDetails getPlayerById(Long playerId);

	    PlayerDetails addPlayer(PlayerDetails player);

	    PlayerDetails updatePlayer(Long playerId, PlayerDetails player);

	    void deletePlayer(Long playerId);
}
