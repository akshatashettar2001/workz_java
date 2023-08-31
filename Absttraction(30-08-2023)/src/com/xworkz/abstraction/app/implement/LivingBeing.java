package com.xworkz.abstraction.app.implement;

import com.xworkz.abstraction.app.rule.Animal;

public class LivingBeing {
	
	Animal animal;
	
	public void setAnimal(Animal animal)
	{
		this.animal=animal;
	}
	
	public void produceSounds()
	{
		System.out.println("invoking produceSounds() in LivingBeing");
		this.animal.sounds();
	}

}
