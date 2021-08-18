package com.ddlab.rnd.many2many.unidirectional;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;

public class TestMany2ManyUnidirectional {

	public static void storeInfo(ApplicationContext applicationContext) {
		
		Set<Author> howToProgramWithJavaAuthor = new HashSet<Author>();
		Set<Author> howToProgramWithJava2ndAuthors = new HashSet<Author>();

		Author author = new Author();
		author.setAuthorName("Trevor Page");
		howToProgramWithJavaAuthor.add(author);

		Author author2 = new Author();
		author2.setAuthorName("John Doe");

		howToProgramWithJava2ndAuthors.add(author);
		howToProgramWithJava2ndAuthors.add(author2);

		Book book = new Book();
		book.setBookName("How to Program with Java");

		book.setAuthors(howToProgramWithJavaAuthor);

		UniDirectionalService service = applicationContext.getBean(UniDirectionalService.class);
		service.saveInfo(book);
	}

}
