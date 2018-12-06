package com.mindtree.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mindtree.entity.Country;
import com.mindtree.entity.Players;
import com.mindtree.service.serviceImpl.CricketServiceImpl;

public class CricketMain {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	do {
		System.out.println("Enter your choice");
		System.out.println("*******************************\n"
				+ "'1' for entering player details\n"
				+ "'2' to display players who scored >= 100 runs and taken wickets >=15\n"
				+ "'3' to delete name of the country from country table that is not in use\n"
				+ "'4' to update query for runs made who has taken more than 20 wickets\n"
				+ "'5'exit\n*******************************");
		int choiceOption= Integer.parseInt(br.readLine());
		
		Players playerDetails = new Players();
		Country countryDetails = new Country();
		
		switch (choiceOption) {
		case 1: 
			
			System.out.println("Enter player Id");
			int playerId = Integer.parseInt(br.readLine());
			playerDetails.setPlayerId(playerId);
			System.out.println("Enter country Id");
			int countryId = Integer.parseInt(br.readLine());
			countryDetails.setCountryId(countryId);
			playerDetails.setCountryId(countryDetails);
			System.out.println("Enter date");
			String date= br.readLine();
			playerDetails.setDate(date);
			System.out.println("Enter player name");
			String playerName = br.readLine();
			playerDetails.setPlayerName(playerName);
			System.out.println("Enter runs made");
			int runsMade = Integer.parseInt(br.readLine());
			playerDetails.setRunsMade(runsMade);
			System.out.println("Enter wickets taken");
			int wicketTaken = Integer.parseInt(br.readLine());
			playerDetails.setWicketTaken(wicketTaken);
			
			
			CricketServiceImpl insertPlayerDetail = new CricketServiceImpl();
			insertPlayerDetail.insertIntoPlayers(playerDetails);
			break;
		
		case 2:
			System.out.println("Player ID\tCountry ID\tDate\t\t\t\tPLayerName\tRunsMade\tWickertTaken");
			CricketServiceImpl selectPlayer = new CricketServiceImpl();
			selectPlayer.searchPlayer();
			
			break;
		case 3:
			CricketServiceImpl deleteCountry = new CricketServiceImpl();
			deleteCountry.deleteCountry();
			
			break;
		case 4:
			System.out.println("Player ID\tCountry ID\tDate\t\t\t\tPLayerName\tRunsMade\tWickertTaken");
			CricketServiceImpl updatePlayer = new CricketServiceImpl();
			updatePlayer.updatePlayer();
			
			
			break;
		case 5:
			
			System.exit(0);
			break;
		default:
			System.out.println("Invalid entry Please enter again");
			break;
		}
		
	}
	while (true);
	}
}
