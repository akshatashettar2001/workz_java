package com.vikram.app.repository;

public interface JuiceRepository {
	
	int TOTAL_JUICES = 10;
	
	void save(String juiceName);
	
	default boolean isExist(String juiceName) {
		
		return false;
	}
	
}
