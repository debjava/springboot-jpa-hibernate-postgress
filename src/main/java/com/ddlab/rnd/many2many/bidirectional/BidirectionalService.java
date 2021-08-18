package com.ddlab.rnd.many2many.bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidirectionalService {

	@Autowired
	private BidirectionalRepo repo;

	public void saveInfo(Artist artist) {
		repo.save(artist);
	}
}
