package com.ddlab.rnd.one2many.bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiDirPostService {
	
	@Autowired
	private BiDirPostRepo repo;
	
	public void savePost(BiDirPost post) {
		repo.save(post);
	}
}
