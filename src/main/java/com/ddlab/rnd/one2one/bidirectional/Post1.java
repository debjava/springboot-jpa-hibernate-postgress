package com.ddlab.rnd.one2one.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "Post1")
@Table(name = "post1")
public class Post1 {

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	@OneToOne(mappedBy = "post", 
			cascade = CascadeType.ALL, 
			fetch = FetchType.LAZY)
	private PostDetails details;

	public Post1() {
	}

	public Post1(String title) {
		this.title = title;
	}

	public void setDetails(PostDetails details) {
		if (details == null) {
			if (this.details != null) {
				this.details.setPost(null);
			}
		} else {
			details.setPost(this);
		}
		this.details = details;
	}
}