package com.ddlab.rnd.one2one.unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address {

	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_ID")
	private long id;

	@Column(name = "CITY")
	private String city;

	public Address() {

	}

	public Address(String city) {
		this.city = city;
	}
}