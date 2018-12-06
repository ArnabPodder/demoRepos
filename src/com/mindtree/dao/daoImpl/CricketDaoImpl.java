package com.mindtree.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mindtree.dao.CricketDao;
import com.mindtree.entity.Players;
import com.mindtree.service.serviceImpl.CricketServiceImpl;
import com.mindtree.utility.ConnectionToDb;

public class CricketDaoImpl implements CricketDao{
	
	
	public void insertIntoPlayers(Players playerDetails) throws Exception {
		
		ConnectionToDb connectionToDb = new ConnectionToDb();
		Connection connection = (Connection)ConnectionToDb.connect();
		
		String query="insert into players(playerID, countryId, date, playerName, runsMade, wicketTaken) values (?,?,?,?,?,?)";
		PreparedStatement prepare = connection.prepareStatement(query);
		
		prepare.setInt(1, playerDetails.getPlayerId());
		prepare.setInt(2, playerDetails.getCountryId().getCountryId());
		prepare.setString(3, playerDetails.getDate());
		prepare.setString(4, playerDetails.getPlayerName());
		prepare.setInt(5, playerDetails.getRunsMade());
		prepare.setInt(6, playerDetails.getWicketTaken());
		
		prepare.executeUpdate();
		
		System.out.println("\nPLAYER ADDED SUCCESSFULLY");
	}
	
	public void searchPlayer() throws Exception {
		
		ConnectionToDb connectionToDb = new ConnectionToDb();
		Connection connection = (Connection)ConnectionToDb.connect();
		
		String query="select * from players where runsMade >=100 and wicketTaken>=15";
		
		PreparedStatement prepare = connection.prepareStatement(query);
		ResultSet result = prepare.executeQuery();
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t\t"+result.getInt(2)+"\t\t"+result.getString(3)+"\t\t"+result.getString(4)+"\t\t"+result.getInt(5)+"\t\t"+result.getInt(6));
		}
		System.out.println("");
	}
	public void deleteCountry() throws Exception {
		
		ConnectionToDb connectionToDb = new ConnectionToDb();
		Connection connection = (Connection)ConnectionToDb.connect();
		
		String query="delete from country where countryId = 5";

		PreparedStatement prepare = connection.prepareStatement(query);
		prepare.executeUpdate();
		
//		PreparedStatement prepare = connection.prepareStatement(query);
//		ResultSet result = prepare.executeQuery();
//		while(result.next())
//		{
//			System.out.println(result.getInt(1)+"\t\t"+result.getString(2));
//		}
//		System.out.println("");
	}
	public void updatePlayer() throws Exception {
		
		ConnectionToDb connectionToDb = new ConnectionToDb();
		Connection connection = (Connection)ConnectionToDb.connect();
		
		String query="update players set runsMade=9999 where wicketTaken>=20";
		
		PreparedStatement prepare = connection.prepareStatement(query);
		prepare.executeUpdate();
//		ResultSet result = prepare.executeQuery();
//		while(result.next())
//		{
//			System.out.println(result.getInt(1)+"\t\t"+result.getInt(2)+"\t\t"+result.getString(3)+"\t\t"+result.getString(4)+"\t\t"+result.getInt(5)+"\t\t"+result.getInt(6));
//		}
//		System.out.println("");
	}
	
	
	

}


//public void deleteCountry() throws Exception {
//	
//	ConnectionToDb connectionToDb = new ConnectionToDb();
//	Connection connection = (Connection)ConnectionToDb.connect();
//	
////	String query1="alter table country add foreign key (countryId) refernces players(countryId))";
////	PreparedStatement prepare = connection.prepareStatement(query1);
////	prepare.executeQuery();
//	String query="delete from country where countryId=5";
//	PreparedStatement prepare2 = connection.prepareStatement(query);
//	ResultSet result = prepare2.executeQuery();
//			
////	String query2 = "select * from country";
////	PreparedStatement prepare1 = connection.prepareStatement(query2);
////	ResultSet result = prepare1.executeQuery();
//	while(result.next())
//	{
//		System.out.println(result.getInt(1)+"\t\t"+result.getString(2));
//	}
//	System.out.println("");
//	
//	
//	CricketServiceImpl viewCountry = new CricketServiceImpl();
//	viewCountry.deleteCountry();
//
