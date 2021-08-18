package com.ddlab.rnd.one2one.bidirectional;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "PostDetails")
@Table(name = "post_details")
public class PostDetails {
 
//    @Id
//    @GeneratedValue
//    private Long id;
// 
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "post_id")
//    private Post1 post;
    
    // Better way to do it
    // https://vladmihalcea.com/the-best-way-to-map-a-onetoone-relationship-with-jpa-and-hibernate/
    @Id
    private Long id;
 
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Post1 post;
    
    private String name;
 
    public PostDetails() {}
 
    public PostDetails(String name) {
        this.name = name;
    }
}