package org.teamA02.iso.server;

import org.teamA02.iso.domain.Blog;

public class BlogDAO implements DAO<Blog>{
	
	@Override
	public Blog read(String id) {
		return null;
	}

	@Override
	public boolean delete(Blog entity) {
		return false;
	}

	@Override
	public boolean update(Blog entity) {
		return false;
	}

	@Override
	public boolean create(Blog entity) {
		return false;
	}

}
