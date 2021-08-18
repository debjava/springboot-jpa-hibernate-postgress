package com.ddlab.rnd.many2many.unidirectional;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue
	private Long bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "author_book", 
		joinColumns = @JoinColumn(name = "book_id"),
		inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors;

}