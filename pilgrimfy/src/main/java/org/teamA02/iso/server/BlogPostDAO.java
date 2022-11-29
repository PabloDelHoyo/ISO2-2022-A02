package org.teamA02.iso.server;

import org.teamA02.iso.domain.BlogPost;

public class BlogPostDAO implements DAO<BlogPost>{

	@Override
	public BlogPost read(String id) {
		return null;
	}

	@Override
	public boolean delete(BlogPost entity) {
		return false;
	}

	@Override
	public boolean update(BlogPost entity) {
		return false;
	}

	@Override
	public boolean create(BlogPost entity) {
		return false;
	}

}
