package com.ddlab.rnd.one2many.unidirectional;

import org.springframework.context.ApplicationContext;

public class TestOne2ManyUniDirectional {
	
	public static void storeInfo(ApplicationContext applicationContext) {
		Post post = new Post("First post");
		post.getComments().add(new PostComment("My first review"));
		post.getComments().add(new PostComment("My second review"));
		post.getComments().add(new PostComment("My third review"));
		
		PostService service = applicationContext.getBean(PostService.class);
		service.savePost(post);
	}

}
