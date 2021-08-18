package com.ddlab.rnd.one2one.unidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class One2OneUnidirectionalService {

	@Autowired
	private One2OneUnidirectionalRepo repo;
	
	public void saveInfo(Student s) {
		repo.save(s);
	}
}
