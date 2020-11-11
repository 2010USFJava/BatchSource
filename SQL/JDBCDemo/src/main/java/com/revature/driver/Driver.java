package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Album;
import com.revature.daoimpl.AlbumDaoImpl;

public class Driver {

	public static void main(String[] args) {
		AlbumDaoImpl adi=new AlbumDaoImpl();
		try {
			List<Album> aList= (ArrayList<Album>)adi.getAllAlbums();
			System.out.println(aList.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
