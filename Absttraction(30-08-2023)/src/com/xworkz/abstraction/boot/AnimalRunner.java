package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.implement.Dog;
import com.xworkz.abstraction.app.implement.LivingBeing;
import com.xworkz.abstraction.app.rule.Animal;

public class AnimalRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in AnimalRUnner");
		
		Animal animal=new Dog();
		
		LivingBeing livingBeing=new LivingBeing();
		livingBeing.setAnimal(animal);
		livingBeing.produceSounds();
		

	}

}
