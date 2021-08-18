package com.ddlab.rnd.one2one.unidirectional;

import org.springframework.context.ApplicationContext;

public class TestOne2OneUnidirectional {
	
	public static void storeInfo(ApplicationContext applicationContext) {
		Student s = new Student("Ram");
		Address a = new Address("Bangalore");
		s.setAddress(a);
		
		One2OneUnidirectionalService service = applicationContext.getBean(One2OneUnidirectionalService.class);
		service.saveInfo(s);
	}

}
