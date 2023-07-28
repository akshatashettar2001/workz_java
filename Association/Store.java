package com.akshata.store.app;


public class Store {
	
   public void email(String[] emails){
	   int length=emails.length;
	   for(int index=0;index<length;index++){
		   System.out.println("email at index"+index+" is "+emails[index]);
	   }
	   
   }
   
   public void groceryItem(String[] groceryItems){
	   int length=groceryItems.length;
	   for(int index=0;index<length;index++){
		   System.out.println("groceryItem at index"+index+" is "+groceryItems[index]);
	   }
	   
   }
   
   public void iplTeam(String[] iplTeams){
	   int length=iplTeams.length;
	   for(int index=0;index<length;index++){
		   System.out.println("iplTeam at index"+index+" is "+iplTeams[index]);
	   }
	   
   }

}
