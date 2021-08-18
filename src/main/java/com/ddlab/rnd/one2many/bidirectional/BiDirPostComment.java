package com.ddlab.rnd.one2many.bidirectional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "BiDirPostComment")
@Table(name = "bidirpost_comment")
public class BiDirPostComment {

	@Id
	@GeneratedValue
	private Long id;

	private String review;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private BiDirPost post;

	public BiDirPostComment() {	}

	public BiDirPostComment(String review) {
		this.review = review;
	}
}