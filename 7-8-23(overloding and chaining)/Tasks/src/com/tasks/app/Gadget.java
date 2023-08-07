package com.tasks.app;

public class Gadget {
	public void phone(){
        System.out.println("invoking phone without arguments");
        phone("Lava");
        phone(25000);
        phone("I Phone",75000);
    }
    public void phone(String companyName){
        System.out.println("invoking phone with String in Gadget");
        System.out.println("Company: "+companyName);
    }
    public void phone(int cost){
        System.out.println("invoking phone with int in Gadget");
        System.out.println("Cost: "+ cost);
    }
    public void phone(String companyName , int cost){
        System.out.println("invoking phone with String and int in Gadget");
        System.out.println("Company: " + companyName+"Cost: "+cost);
    }    

}
