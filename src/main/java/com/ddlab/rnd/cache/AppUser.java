package com.ddlab.rnd.cache;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name = "appuser")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AppUser {

	@Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;
    
    public AppUser() {}
    
    public AppUser(String name) {
    	this.name = name;
    }
}
