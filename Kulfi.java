class Kulfi{
	static void cool(String name,String flavor,float price){
		System.out.println("Name of the kulfi:"+name);
		if(name!=null){
			System.out.println("valid kulfi");
		}
		else{
			System.err.println("in-valid kulfi");
			return;
		}
		System.out.println("flavor name:"+flavor);
		if(flavor!=null){
			System.out.println("valid flavor");
		}
		else{
			System.err.println("in-valid flavor ");
			return;
		}
		System.out.println("price:"+price);
		if(price>20 && price<100){
			System.out.println("valid price");
		}
		else{
			System.err.println("in-valid price");
			return;
		}
		System.out.println("all the conditions are valid");
	}
		public static void main(String[] args){
			Kulfi.cool("Mango Madness Kulfi","Mango",50f);
			System.out.println("\n\n");
			WeighMachine.measure("Butterscotch Kulfi",null,60f);
			System.out.println("\n\n");
			
		
	    }
}