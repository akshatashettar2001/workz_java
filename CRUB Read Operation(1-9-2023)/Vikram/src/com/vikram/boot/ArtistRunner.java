package com.vikram.boot;

import com.vikram.app.implementation.ArtistRepositoryImpl;
import com.vikram.app.repository.ArtistRepository;

public class ArtistRunner {
	public static void main(String[] args) {

		ArtistRepository repo = new ArtistRepositoryImpl();

		repo.group("Raveendra");
		repo.group("Hussian");
		repo.group("S.H.Raza");
		repo.group("Tyeb Mehta");
		repo.group("Souza");
		repo.group("Mahesh");
		repo.group("Gowrav");

	}
}
