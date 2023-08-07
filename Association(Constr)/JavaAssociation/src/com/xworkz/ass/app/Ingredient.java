package com.xworkz.ass.app;

public class Ingredient {
public String name;
public String quantity;
public double cost;

Ingredient(String name,String quantity,double cost){
	this.name=name;
	this.quantity=quantity;
	this.cost=cost;
}

public void printInfo(){
	System.out.println("invoking printInfo in Ingredient");
	System.out.println("name of the ingredient:"+name);
	System.out.println("quantity:"+quantity);
	System.out.println("cost:"+cost);
}
}
