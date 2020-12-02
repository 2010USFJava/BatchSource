package com.revature;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Pokemon;
import com.revature.models.Type;
import com.revature.repositories.IPokemonDAO;
import com.revature.repositories.PokemonDAO;
import com.revature.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {
		// this object is in the TRANSIENT state
		Pokemon p = new Pokemon(0, "Bulbasaur", Type.Grass, null);
		
		System.out.println(p.getName());

		Session s = HibernateUtil.getSession();
		
		Transaction tx = s.beginTransaction();
		
		// Will perform either an INSERT or an UPDATE
		s.save(p);
		
		// This Pokemon object is now PERSISTENT
		
		tx.commit();
		
		tx = s.beginTransaction();
		
//		Pokemon fromDB = s.get(Pokemon.class, 1);
		
		System.out.println(p);
		
//		System.out.println(fromDB);
//		
//		System.out.println(p.equals(fromDB));
//		System.out.println(p == fromDB);
		
		Pokemon p2 = new Pokemon(0, "Charmander", Type.Fire, null);
		
		s.save(p2);
		
//		Pokemon fromDB2 = s.get(Pokemon.class, 2);
		
//		System.out.println(fromDB2);
		
//		tx.rollback();
		
//		fromDB = s.get(Pokemon.class, 1);
//		fromDB2 = s.get(Pokemon.class, 2);
		
//		System.out.println(fromDB);
//		System.out.println(fromDB2);
		
		// Potential code to use for managing transactions with an application
//		Session s2 = HibernateUtil.getSession();
//		
//		Transaction tx2 = s2.beginTransaction();
//		
//		try {
//			
//			// Could throw the exception
//			
//			tx2.commit();
//		} catch (SQLException e) {
//			tx2.rollback();
//		}
		
		IPokemonDAO pokemonDAO = new PokemonDAO();
		
		List<Pokemon> all = pokemonDAO.findAll();
		
		System.out.println(all);
		
		Set<Pokemon> set = pokemonDAO.findAllAsSet();
		
		System.out.println(set);
		
		pokemonDAO.delete(all.get(1));
		
		set = pokemonDAO.findAllAsSet();
		
		System.out.println(set);
	}

}
