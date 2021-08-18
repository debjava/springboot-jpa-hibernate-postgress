package com.ddlab.rnd.many2many.bidirectional;

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

//@Data
@Entity
@Table(name = "albums")
public class Albums {

	@Id
	@GeneratedValue
	@Column(name = "album_id")
	private Long albumId;
	
	@Column(name = "album_name")
	private String albumName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "artist_album", joinColumns = @JoinColumn(name = "album_id"), inverseJoinColumns = @JoinColumn(name = "artist_id"))
	private Set<Artist> artists;

	public Long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}

}
