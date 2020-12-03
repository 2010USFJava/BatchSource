package com.revature.repositories;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.revature.models.Pokemon;
import com.revature.models.Trainer;
import com.revature.util.HibernateUtil;

/*
 * Methods that are on the Session Interface:
 * 
 * save() & persist() -> result in a SQL insert
 * update() & merge() -> result in a SQL update
 * delete()			  -> result in a SQL delete
 * get() & load()	  -> result in a SQL select
 * 
 * saveOrUpdate()	  -> result in either a SQL insert or update accordingly
 * 
 * 
 * 
 * 
 * get() will retrieve from the database immediately
 * 
 * load() will use a placeholder (called a proxy) until you actually need the value
 * 			Attempting to use the proxy after the session is closed will result in a
 * 			LazyInitializationException
 * 
 * merge() will insert into the cache or overwrite the value in the cache accordingly
 * 
 * update() does NOT allow duplicates in the cache
 * 		If the entity was already in the cache, this will throw an exception
 */

public class PokemonDAO implements IPokemonDAO {

	@Override
	public Pokemon findById(int id) {
		Session s = HibernateUtil.getSession();
		
		return s.get(Pokemon.class, id);
	}
	
	/*
	 * Hibernate has a few different means by which to perform queries
	 * 
	 * NativeSQL queries
	 * 		We can write raw SQL
	 * Hibernate Query Language (HQL) / (Java Persistence Query Language) JPQL
	 * 		We can write syntax similar to raw SQL, except it is more object-oriented
	 * 		- Instead of referencing table names or column names, you use Java Class names & variable names
	 * 		- Supports dot notation (e.g Pokemon p -> p.type )
	 * Query API
	 * 		Interface provided by Hibernate
	 * 		Not particularly type-safe
	 * Criteria API (Criteria Query API)
	 * 		More complex than just the Query Interface
	 * 		Type-safe and supports more nuanced queries
	 */

	@Override
	public Pokemon findByName(String name) {
		Session s = HibernateUtil.getSession();
		
		// Uses HQL
		Query query = s.createQuery("From Pokemon p WHERE p.name = :name", Pokemon.class);
		
		query.setParameter("name", name);
		
		Pokemon p = (Pokemon) query.getSingleResult();
		
		return p;
	}

	@Override
	public List<Pokemon> findAll() {
		Session s = HibernateUtil.getSession();
		
		Query query = s.createQuery("From Pokemon p", Pokemon.class);
		
		return (List<Pokemon>) query.getResultList();
	}

	@Override
	public Set<Pokemon> findAllAsSet() {
		Session s = HibernateUtil.getSession();
		
		Query query = s.createQuery("From Pokemon p", Pokemon.class);
		
		return (Set<Pokemon>) query.getResultStream()
				.collect(Collectors.toSet());
	}

	@Override
	public List<Pokemon> findByTrainer(Trainer t) {
		// Using Hibernate's Criteria Query API
		
		Session s = HibernateUtil.getSession();
		
		CriteriaBuilder builder = s.getCriteriaBuilder();
		CriteriaQuery<Pokemon> query = builder.createQuery(Pokemon.class);
		
		Root<Pokemon> root = query.from(Pokemon.class);
		
		Join<Pokemon, Trainer> join = root.join("trainers", JoinType.INNER);
		
		query.select(root).where(builder.equal(join.get("id"), t.getId()));
		
		return s.createQuery(query).getResultList();
	}

	@Override
	public void insert(Pokemon p) {
		Session s = HibernateUtil.getSession();
		
		s.save(p);

	}

	@Override
	public void update(Pokemon p) {
		Session s = HibernateUtil.getSession();
		
		s.merge(p);
	}

	@Override
	public void delete(Pokemon p) {
		Session s = HibernateUtil.getSession();
		
		s.delete(p);
	}
}
