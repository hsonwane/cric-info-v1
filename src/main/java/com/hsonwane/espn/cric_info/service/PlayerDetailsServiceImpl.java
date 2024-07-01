package com.hsonwane.espn.cric_info.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsonwane.espn.cric_info.dto.PlayerDetails;
import com.hsonwane.espn.cric_info.repo.PlayerDetailsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlayerDetailsServiceImpl implements PlayerDeatilsService{
	
	@Autowired
	private PlayerDetailsRepository repo;
	
	/**
	 * 
	 */
	public PlayerDetailsServiceImpl() {
		super();
	}

	/**
	 * @param repo
	 */
	public PlayerDetailsServiceImpl(PlayerDetailsRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<PlayerDetails> getAllPlayersByTeamName(String teamName) {
		 return repo.getAllByTeamName(teamName);
	}

	@Override
	public PlayerDetails getPlayerById(Long playerId) {
		return repo.getReferenceById(playerId);
	}

	@Override
	public PlayerDetails addPlayer(PlayerDetails player) {
		return repo.save(player);
	}

	@Override
	public PlayerDetails updatePlayer(Long playerId, PlayerDetails player) {
		Optional<PlayerDetails> optionalPlayer = repo.findById(playerId);
        if (optionalPlayer.isPresent()) {
        	player.setPlayerId(playerId);
            return repo.save(player);
        }
        return null;
	}

	@Override
	public void deletePlayer(Long playerId) {
		PlayerDetails savedplayer = repo.getReferenceById(playerId);
		if(null != savedplayer) {
			repo.deleteById(playerId);
		}		
	}

	@Override
	public List<PlayerDetails> getAllPlayers() {
		return repo.findAll();
	}

}
