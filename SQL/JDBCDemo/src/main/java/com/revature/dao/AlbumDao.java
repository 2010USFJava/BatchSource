package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Album;

public interface AlbumDao {
	//crud ops
	public List<Album> getAllAlbums() throws SQLException;
}
