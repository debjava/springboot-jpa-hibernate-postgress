package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ddlab.rnd.cache.TestUserCache;

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
//		TestMany2ManyBidirectional.storeInfo(applicationContext);
		
//		TestBatchInsert.batchInsert(applicationContext);
		
//		TestBatchInsert.batchInsertUsingEntityManager(applicationContext);
		
		TestUserCache.testCache(applicationContext);
		
	}

}
