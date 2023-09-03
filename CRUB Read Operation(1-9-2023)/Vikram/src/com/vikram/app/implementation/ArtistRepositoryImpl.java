package com.vikram.app.implementation;

import com.vikram.app.repository.ArtistRepository;

public class ArtistRepositoryImpl implements ArtistRepository {

	private String[] artists = new String[TOTAL_ARTISTS];
	int place;

	@Override
	public void group(String artist) {
		System.out.println("invoking group in ArtistRepositoryImpl..");

		if (this.place < TOTAL_ARTISTS) {
			this.artists[place] = artist;
			System.out.println("Stored " + artist + " in place " + this.place);
			this.place++;
		}

		else {
			System.err.println("Places are filles,can not store artist..");
		}
	}

}
