package com.ddlab.rnd.one2many.unidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "PostComment")
@Table(name = "post_comment")
public class PostComment {

	@Id
	@GeneratedValue
	private Long id;

	private String review;

	public PostComment() {

	}

	public PostComment(String review) {
		this.review = review;
	}
}