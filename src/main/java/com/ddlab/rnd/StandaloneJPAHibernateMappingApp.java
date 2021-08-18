package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ddlab.rnd.many2many.bidirectional.TestMany2ManyBidirectional;
import com.ddlab.rnd.many2many.unidirectional.TestMany2ManyUnidirectional;
import com.ddlab.rnd.one2many.bidirectional.TestOne2ManyBidirectional;
import com.ddlab.rnd.one2many.unidirectional.TestOne2ManyUniDirectional;
import com.ddlab.rnd.one2one.bidirectional.TestOne2OneBidirectional;
import com.ddlab.rnd.one2one.unidirectional.TestOne2OneUnidirectional;

@SpringBootApplication
public class StandaloneJPAHibernateMappingApp {


	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StandaloneJPAHibernateMappingApp.class, args);
		
		// One-One UniDirectional
//		TestOne2OneUnidirectional.storeInfo(applicationContext);
		
		// One-One BiDirectional
//		TestOne2ManyBidirectional.storeInfo(applicationContext);
		
//		// One-Many Unidirectional
//		TestOne2ManyBidirectional.storeInfo(applicationContext);
//		
//		// One-Many Bidirectional
//		TestOne2OneBidirectional.storeInfo(applicationContext);
//		
//		// Many-Many UniDirectional
//		TestMany2ManyUnidirectional.storeInfo(applicationContext);
//		
//		// Many-Many Bidirectional
		TestMany2ManyBidirectional.storeInfo(applicationContext);
		
	}

}
