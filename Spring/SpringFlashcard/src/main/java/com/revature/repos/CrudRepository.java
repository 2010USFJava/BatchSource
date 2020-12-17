package com.revature.repos;

import java.util.List;

public interface CrudRepository<T> {
	
	List<T> getAll();
	T getById(int id);
	T add(T newObject);
	T update(T updatedObject);
	boolean delete(int id);

}
