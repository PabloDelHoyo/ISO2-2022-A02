package org.teamA02.iso.server;

public interface DAO<T> {
	T read(String id);
	boolean delete(String id);
	boolean update(String id);
	boolean create(T entity);
}
