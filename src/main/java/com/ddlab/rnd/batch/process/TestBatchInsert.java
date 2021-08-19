package com.ddlab.rnd.batch.process;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

public class TestBatchInsert {
	
	private final static int TOTAL = 4;

	public static void batchInsert(ApplicationContext applicationContext) {

		CustomerService service = applicationContext.getBean(CustomerService.class);
		List<Customer> custList = new ArrayList<Customer>();

		for (int i = 0; i < TOTAL; i++) {
			Customer cust = new Customer("First Name - " + i, "Last Name - " + i);
			custList.add(cust);
		}
		service.saveAllCustomers(custList);

	}

	public static void batchInsertUsingEntityManager(ApplicationContext applicationContext) {
		CustomerService service = applicationContext.getBean(CustomerService.class);
		List<Customer> custList = new ArrayList<Customer>();

		for (int i = 0; i < TOTAL; i++) {
			Customer cust = new Customer("First Name - " + i, "Last Name - " + i);
			custList.add(cust);
		}

		service.saveAllCustomers_usingEntityManager(custList);
	}
}
