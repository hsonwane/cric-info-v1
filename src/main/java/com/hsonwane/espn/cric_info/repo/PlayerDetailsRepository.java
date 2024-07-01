package com.hsonwane.espn.cric_info.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hsonwane.espn.cric_info.dto.PlayerDetails;

public interface PlayerDetailsRepository extends JpaRepository<PlayerDetails, Long>{
	
	@Query("select p from PlayerDetails p where p.teamName = ?1")
	public List<PlayerDetails> getAllByTeamName(String teamName);
}
