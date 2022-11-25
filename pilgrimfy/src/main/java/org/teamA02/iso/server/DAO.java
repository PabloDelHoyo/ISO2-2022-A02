package org.teamA02.iso.server;

public interface DAO<T> {
	T read(String id);
	boolean delete(T entity);
	boolean update(T entity);
	boolean create(T entity);
}
