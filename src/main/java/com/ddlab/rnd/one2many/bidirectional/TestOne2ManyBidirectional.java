package com.ddlab.rnd.one2many.bidirectional;

import org.springframework.context.ApplicationContext;

public class TestOne2ManyBidirectional {
	
	public static void storeInfo(ApplicationContext applicationContext) {
		BiDirPost post = new BiDirPost("First post");
		post.addComment(new BiDirPostComment("My first review"));
		post.addComment(new BiDirPostComment("My second review"));
		post.addComment(new BiDirPostComment("My third review"));
		
		BiDirPostService service = applicationContext.getBean(BiDirPostService.class);
		service.savePost(post);
	}

}
