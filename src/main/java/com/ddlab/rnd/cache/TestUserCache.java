package com.ddlab.rnd.cache;

import org.springframework.context.ApplicationContext;

public class TestUserCache {
	
	public static void testCache(ApplicationContext applicationContext) {
		UserService service = applicationContext.getBean(UserService.class);
		
		AppUser user = new AppUser("Hati");
		service.saveUser(user);
		
		user = service.getUserById(Long.valueOf(320));
		System.out.println("User : "+user);
	}

}
