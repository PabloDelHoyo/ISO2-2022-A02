package org.teamA02.iso.server;
import org.teamA02.iso.domain.User;
public class UserDao implements DAO<User>{
	@Override
	public User read(String id) {
		return null;
	}

	@Override
	public boolean delete(User entity) {
		return false;
	}

	@Override
	public boolean update(User entity) {
		return false;
	}

	@Override
	public boolean create(User entity) {
		return false;
	}
}
