package com.mindtree.dao;

import com.mindtree.entity.Players;

public interface CricketDao {
	public void insertIntoPlayers(Players playerDetails) throws Exception;
	public void searchPlayer() throws Exception;
}
