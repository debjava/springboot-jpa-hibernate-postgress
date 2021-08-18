package com.ddlab.rnd.one2one.bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class One2OneBidirectionalService {
	
	@Autowired
	private One2OneBidirectionalRepo repo;
	
	public void saveCustInfo(Post1 post1) {
		repo.save(post1);
	}
}
