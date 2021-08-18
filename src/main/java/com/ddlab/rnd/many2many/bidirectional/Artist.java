package com.ddlab.rnd.many2many.bidirectional;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name = "artist")
public class Artist {

	@Id
	@GeneratedValue
	@Column(name = "artist_id")
	private Long artistId;
	
	@Column(name = "artist_name")
	private String artistName;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "artists")
	private Set<Albums> albums;

	public Long getArtistId() {
		return artistId;
	}

	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Set<Albums> getAlbums() {
		return albums;
	}

	public void setAlbums(Set<Albums> albums) {
		this.albums = albums;
	}
}
