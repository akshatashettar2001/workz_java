package com.vikram.app.implementation;

import com.vikram.app.repository.JuiceRepository;

public class JuiceRepositoryImpl  implements JuiceRepository {
	private String[] juices = new String[TOTAL_JUICES];
	int position;

	@Override
	public void save(String juiceName) {
		System.out.println("Invoking save in JuiceRepositoryImpl...");

		if (this.position < TOTAL_JUICES) {
			this.juices[position] = juiceName;
			System.out.println("Stored " + juiceName + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store juice...");
		}
	}

	@Override
	public boolean isExist(String juiceName) {
		for (int start=0;start<=this.position;start++) {
			String temp=this.juices[start];
			if(temp!=null && temp.equals(juiceName)) {
				System.err.println("JuiceName is already exist");
				return true;
			}
		}
		return false;

	}


}
