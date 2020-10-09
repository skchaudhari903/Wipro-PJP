package com.wipro;

public class Player {
	private String playerId, playerName;
	private Country country;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public void display() {
		System.out.println("ID:" + this.getPlayerId());
		System.out.println("Name:" + this.getPlayerName());
		System.out.println("Country ID:" + this.getCountry().getCountryId());
		System.out.println("Country Name:" + this.getCountry().getCountryName());
		System.out.println();
	}
}
