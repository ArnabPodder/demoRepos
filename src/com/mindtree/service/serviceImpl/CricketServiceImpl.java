package com.mindtree.service.serviceImpl;

import com.mindtree.dao.daoImpl.CricketDaoImpl;
import com.mindtree.entity.Players;
import com.mindtree.service.CricketService;

public class CricketServiceImpl implements CricketService {
	CricketDaoImpl daoObject = new CricketDaoImpl();
	public void insertIntoPlayers(Players playerDetails) {
		
		try {
			daoObject.insertIntoPlayers(playerDetails);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchPlayer() {
		try {
			daoObject.searchPlayer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteCountry() {
		try {
			daoObject.deleteCountry();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updatePlayer() {
		try {
			daoObject.updatePlayer();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
