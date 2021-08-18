package com.ddlab.rnd.one2many.bidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "BiDirPost")
@Table(name = "bidirpost")
public class BiDirPost {
 
    @Id
    @GeneratedValue
    private Long id;
 
    private String title;
 
    @OneToMany(
    		// attribute from other class BiDirPostComment, ie. private BiDirPost post;
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
    private List<BiDirPostComment> comments = new ArrayList<>();
    
    public BiDirPost() {
    	
    }
    
    public BiDirPost(String title) {
    	this.title = title;
    }
 
    public void addComment(BiDirPostComment comment) {
        comments.add(comment);
        comment.setPost(this);
    }
 
    public void removeComment(BiDirPostComment comment) {
        comments.remove(comment);
        comment.setPost(null);
    }
}