package com.ddlab.rnd.one2one.bidirectional;

import org.springframework.context.ApplicationContext;

public class TestOne2OneBidirectional {

	public static void storeInfo(ApplicationContext applicationContext) {
		
		Post1 post1 = new Post1("Post Title");
		PostDetails pd = new PostDetails("Post Name");
		post1.setDetails(pd);

		One2OneBidirectionalService service = applicationContext.getBean(One2OneBidirectionalService.class);
		service.saveCustInfo(post1);
	}

}
