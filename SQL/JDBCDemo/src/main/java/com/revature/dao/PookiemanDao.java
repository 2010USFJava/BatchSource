package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Pookieman;

public interface PookiemanDao {
	//insert
	public void catchNewPookieman(Pookieman p) throws SQLException;
	
	// retrieve by id
	public Pookieman retrieveById(int id) throws SQLException;
}
