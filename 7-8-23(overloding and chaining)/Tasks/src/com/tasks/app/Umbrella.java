package com.tasks.app;

public class Umbrella {
	    public void kode(){
	        System.out.println("invoking kodde method without arguments");
	        kode("Style");
	        kode(250);
	        kode("Style",250);
	    } 

	    public void kode(String company){
	        System.out.println("invoking kodde with String in Umbrella");
	        System.out.println("Company: "+company);
	    }
	    
	    public void kode(int cost){
	        System.out.println("invoking kodde with int in Umbrella");
	        System.out.println("Cost: "+ cost);
	    }

	    public void kode(String company , int cost){
	        System.out.println("invoking kodde with String,int in Umbrella");
	        System.out.println("Company: "+company+"\ncost: "+cost);
	    }
	}

