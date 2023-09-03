package com.vikram.app.implementation;

import com.vikram.app.repository.JacketRepository;

public class JacketRepositoryImpl implements JacketRepository {

	private String jackets[] = new String[TOTAL_JACKETS];

	int num;

	@Override
	public void wear(String jacket) {

		System.out.println("invoking wear in JacketRepositoryImpl..");

		if (this.num < TOTAL_JACKETS) {

			this.jackets[num] = jacket;
			System.out.println("Stored " + jacket + " at number " + this.num);
			this.num++;

		} else {

			System.err.println("Storage Full, can't store jackets");
		}

	}
}
