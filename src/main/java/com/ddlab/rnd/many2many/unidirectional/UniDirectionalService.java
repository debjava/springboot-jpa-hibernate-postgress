package com.ddlab.rnd.many2many.unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniDirectionalService {

	@Autowired
	private UniDirectionalRepo repo;
	
	public void saveInfo(Book book) {
		repo.save(book);
	}
}
