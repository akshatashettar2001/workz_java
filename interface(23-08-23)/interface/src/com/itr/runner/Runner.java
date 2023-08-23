package com.itr.runner;

import com.itr.app.EngineeringRules;
import com.itr.app.MetroRules;
import com.itr.app.MilitaryRules;
import com.itr.app.PGRules;
import com.itr.app.TempleRules;
import com.itr.impl.DevoteesTempleRules;
import com.itr.impl.GuestPGRules;
import com.itr.impl.PassengerMetroRules;
import com.itr.impl.SoldiersMilitaryRules;
import com.itr.impl.StudentEngineeringRules;

public class Runner {
	public static void main(String[] args) {

		MetroRules metro = new PassengerMetroRules();
		PGRules pg=new GuestPGRules();
		TempleRules temple=new DevoteesTempleRules();
		MilitaryRules army=new SoldiersMilitaryRules();
		EngineeringRules engineer=new StudentEngineeringRules();

		metro.token();
		metro.noEat();
		
		System.out.println("==============================");
		
		pg.closeTime();
		pg.noSmoke();		
		
		System.out.println("==============================");
		
		temple.noSleepers();
		temple.photos();
		
		System.out.println("==============================");
		
		army.courage();
		army.disciplane();
		
		System.out.println("==============================");
		
		engineer.attendance();
		engineer.idCard();
		

	}
}
