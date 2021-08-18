package com.ddlab.rnd.many2many.bidirectional;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;

public class TestMany2ManyBidirectional {

	public static void storeInfo(ApplicationContext applicationContext) {
		Artist artist1 = new Artist();
		artist1.setArtistName("Trevor Page");

		Set<Artist> popArtists = new HashSet<Artist>();
		popArtists.add(artist1);

		Artist artist2 = new Artist();
		artist2.setArtistName("John Doe");

		Set<Artist> classicalArtists = new HashSet<Artist>();
		classicalArtists.add(artist1);
		classicalArtists.add(artist2);

		Albums album1 = new Albums();
		album1.setAlbumName("How to Program with Java");

		Albums album2 = new Albums();
		album2.setAlbumName("How to Program with Java 2nd Edition");
		
		Set<Albums> popAlbums = new HashSet<Albums>();
		popAlbums.add(album1);
		popAlbums.add(album2);

		Albums album3 = new Albums();
		album3.setAlbumName("How to Play Guitar");
		

		Set<Albums> classicalAlbums = new HashSet<Albums>();
		classicalAlbums.add(album2);
		classicalAlbums.add(album3);
		artist1.setAlbums(popAlbums);
		artist2.setAlbums(classicalAlbums);
		album1.setArtists(popArtists);
		album2.setArtists(classicalArtists);

		BidirectionalService service = applicationContext.getBean(BidirectionalService.class);
		service.saveInfo(artist1);

	}

}
