package com.ddlab.rnd.many2many.unidirectional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "author")
@Entity
public class Author {
	@Id
	@GeneratedValue
	private Long authorId;
	
	@Column(name = "author_name")
	private String authorName;
	
}