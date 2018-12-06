package com.mindtree.entity;

public class Players {
	private int playerId;
	private Country countryId;
	private String date;
	private String playerName;
	private int runsMade;
	private int wicketTaken;
	public Players() {
		super();
	}
	public Players(int playerId, Country countryId, String date, String playerName, int runsMade, int wicketTaken) {
		super();
		this.playerId = playerId;
		this.countryId = countryId;
		this.date = date;
		this.playerName = playerName;
		this.runsMade = runsMade;
		this.wicketTaken = wicketTaken;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public Country getCountryId() {
		return countryId;
	}
	public void setCountryId(Country countryDetails) {
		this.countryId = countryDetails;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getRunsMade() {
		return runsMade;
	}
	public void setRunsMade(int runsMade) {
		this.runsMade = runsMade;
	}
	public int getWicketTaken() {
		return wicketTaken;
	}
	public void setWicketTaken(int wicketTaken) {
		this.wicketTaken = wicketTaken;
	}
	
	

}
