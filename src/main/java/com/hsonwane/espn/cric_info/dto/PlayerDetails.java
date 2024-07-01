package com.hsonwane.espn.cric_info.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PlayerDetails {

	@Id
	@GeneratedValue
	private long playerId;

	private String longName;
	private String shortName;
	/*private LocalDate dateOfBirth;
	private String birthPlace;

	private boolean isBatsman;
	private boolean isBowler;
	private int odiPlayed;
	private int testPlayed;
	private int t20Played;

	private int totalRunsInOdiPlayed;
	private int totalRunsInTestPlayed;
	private int totalRunsInT20Played;
	private String battingStyle;

	private int totalWicketsInOdiPlayed;
	private int totalWicketsInTestPlayed;
	private int totalWicketsInT20Played;
	private String bowlingStyle;
	*/
	private String teamName;

	/**
	 * Default constructor
	 */
	public PlayerDetails() {
		super();
	}
	
	/**
	 * @param playerId
	 * @param longName
	 * @param shortName
	 * @param teamName
	 */
	public PlayerDetails(String longName, String shortName, String teamName) {
		super();
		this.longName = longName;
		this.shortName = shortName;
		this.teamName = teamName;
	}


	/**
	 * Parameterized constructor
	 * @param playerId
	 * @param longName
	 * @param shortName
	 * @param dateOfBirth
	 * @param birthPlace
	 * @param isBatsman
	 * @param isBowler
	 * @param odiPlayed
	 * @param testPlayed
	 * @param t20Played
	 * @param totalRunsInOdiPlayed
	 * @param totalRunsInTestPlayed
	 * @param totalRunsInT20Played
	 * @param battingStyle
	 * @param totalWicketsInOdiPlayed
	 * @param totalWicketsInTestPlayed
	 * @param totalWicketsInT20Played
	 * @param bowlingStyle
	 */
	/*
	 * public PlayerDetails(long playerId, String longName, String shortName,
	 * LocalDate dateOfBirth, String birthPlace, boolean isBatsman, boolean
	 * isBowler, int odiPlayed, int testPlayed, int t20Played, int
	 * totalRunsInOdiPlayed, int totalRunsInTestPlayed, int totalRunsInT20Played,
	 * String battingStyle, int totalWicketsInOdiPlayed, int
	 * totalWicketsInTestPlayed, int totalWicketsInT20Played, String bowlingStyle,
	 * String teamName) { super(); this.playerId = playerId; this.longName =
	 * longName; this.shortName = shortName; this.dateOfBirth = dateOfBirth;
	 * this.birthPlace = birthPlace; this.isBatsman= isBatsman; this.isBowler =
	 * isBowler; this.odiPlayed = odiPlayed; this.testPlayed = testPlayed;
	 * this.t20Played = t20Played; this.totalRunsInOdiPlayed = totalRunsInOdiPlayed;
	 * this.totalRunsInTestPlayed= totalRunsInTestPlayed; this.totalRunsInT20Played
	 * = totalRunsInT20Played; this.battingStyle = battingStyle;
	 * this.totalWicketsInOdiPlayed =totalWicketsInOdiPlayed;
	 * this.totalWicketsInTestPlayed =totalWicketsInTestPlayed;
	 * this.totalWicketsInT20Played =totalWicketsInT20Played; this.bowlingStyle =
	 * bowlingStyle; this.teamName = teamName; }
	 */

	/**
	 * @return the playerId
	 */
	public long getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}

	/**
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/*
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public boolean isBatsman() {
		return isBatsman;
	}

	public void setBatsman(boolean isBatsman) {
		this.isBatsman = isBatsman;
	}

	public boolean isBowler() {
		return isBowler;
	}

	public void setBowler(boolean isBowler) {
		this.isBowler = isBowler;
	}

	public int getOdiPlayed() {
		return odiPlayed;
	}

	public void setOdiPlayed(int odiPlayed) {
		this.odiPlayed = odiPlayed;
	}

	public int getTestPlayed() {
		return testPlayed;
	}

	public void setTestPlayed(int testPlayed) {
		this.testPlayed = testPlayed;
	}

	public int getT20Played() {
		return t20Played;
	}

	public void setT20Played(int t20Played) {
		this.t20Played = t20Played;
	}

	public int getTotalRunsInOdiPlayed() {
		return totalRunsInOdiPlayed;
	}

	public void setTotalRunsInOdiPlayed(int totalRunsInOdiPlayed) {
		this.totalRunsInOdiPlayed = totalRunsInOdiPlayed;
	}

	public int getTotalRunsInTestPlayed() {
		return totalRunsInTestPlayed;
	}

	public void setTotalRunsInTestPlayed(int totalRunsInTestPlayed) {
		this.totalRunsInTestPlayed = totalRunsInTestPlayed;
	}

	public int getTotalRunsInT20Played() {
		return totalRunsInT20Played;
	}

	public void setTotalRunsInT20Played(int totalRunsInT20Played) {
		this.totalRunsInT20Played = totalRunsInT20Played;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public int getTotalWicketsInOdiPlayed() {
		return totalWicketsInOdiPlayed;
	}

	public void setTotalWicketsInOdiPlayed(int totalWicketsInOdiPlayed) {
		this.totalWicketsInOdiPlayed = totalWicketsInOdiPlayed;
	}

	public int getTotalWicketsInTestPlayed() {
		return totalWicketsInTestPlayed;
	}

	public void setTotalWicketsInTestPlayed(int totalWicketsInTestPlayed) {
		this.totalWicketsInTestPlayed = totalWicketsInTestPlayed;
	}

	public int getTotalWicketsInT20Played() {
		return totalWicketsInT20Played;
	}

	public void setTotalWicketsInT20Played(int totalWicketsInT20Played) {
		this.totalWicketsInT20Played = totalWicketsInT20Played;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	*/
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "PlayerDetails [playerId=" + playerId + ", longName=" + longName + ", shortName=" + shortName
				+ ", teamName=" + teamName + "]";
	}

	/*
	 * @Override public String toString() { return "PlayerDetails [playerId=" +
	 * playerId + ", longName=" + longName + ", shortName=" + shortName +
	 * ", dateOfBirth=" + dateOfBirth + ", birthPlace=" + birthPlace +
	 * ", isBatsman=" + isBatsman + ", isBowler=" + isBowler + ", odiPlayed=" +
	 * odiPlayed + ", testPlayed=" + testPlayed + ", t20Played=" + t20Played +
	 * ", totalRunsInOdiPlayed=" + totalRunsInOdiPlayed + ", totalRunsInTestPlayed="
	 * + totalRunsInTestPlayed + ", totalRunsInT20Played=" + totalRunsInT20Played +
	 * ", battingStyle=" + battingStyle + ", totalWicketsInOdiPlayed=" +
	 * totalWicketsInOdiPlayed + ", totalWicketsInTestPlayed=" +
	 * totalWicketsInTestPlayed + ", totalWicketsInT20Played=" +
	 * totalWicketsInT20Played + ", bowlingStyle=" + bowlingStyle + ", teamName=" +
	 * teamName + "]"; }
	 */

	
}
