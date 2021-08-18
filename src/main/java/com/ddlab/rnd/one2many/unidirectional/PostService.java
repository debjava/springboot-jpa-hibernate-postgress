package com.ddlab.rnd.one2many.unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	@Autowired
	private PostRepo repo;
	
	public void savePost(Post post) {
		repo.save(post);
	}
}
