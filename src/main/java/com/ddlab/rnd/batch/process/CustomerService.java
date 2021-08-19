package com.ddlab.rnd.batch.process;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	@PersistenceContext
	private EntityManager em;
	
	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")
	private int batchSize;

	public void saveAllCustomers(List<Customer> custList) {
		repo.saveAll(custList);
	}
	
	@Transactional
	public void saveAllCustomers_usingEntityManager(List<Customer> custList) {
		System.out.println("Now batch Size : "+batchSize);
		for(int i = 0; i < custList.size(); i++) {
			Customer cust = custList.get(i);
			if (i > 0 && i % batchSize == 0) {
	            em.flush();
	            em.clear();
	        }
			em.persist(cust);
		}
		
	}
}
