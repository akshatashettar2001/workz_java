class  WoodKiller{
	public static void main(String[] args){
		System.out.println("invoking main in WoodKiller");
		
		Wood wood1=new Wood("Cubic Wood");
		System.out.println("values for wood1");
		System.out.println("material:"+wood1.material+"\n thickness:"+wood1.thickness+
		"\n size:"+wood1.size+"\n pieces:"+wood1.pieces+"\n price:"+wood1.price);
		
		System.out.println("============================================");
		Wood wood2=new Wood("Rose Wood",5);
		System.out.println("values for wood2");
		System.out.println("material:"+wood2.material+"\n thickness:"+wood2.thickness+
		"\n size:"+wood2.size+"\n pieces:"+wood2.pieces+"\n price:"+wood2.price);
		
		System.out.println("============================================");
		Wood wood3=new Wood("Smoot Wood",7,20,40,2400);
		System.out.println("values for wood3");
		System.out.println("material:"+wood3.material+"\n thickness:"+wood3.thickness+
		"\n size:"+wood3.size+"\n pieces:"+wood3.pieces+"\n price:"+wood3.price);
		
		System.out.println("============================================");
		Mall mall1=new Mall();
		System.out.println("values for mall1");
		System.out.println("name:"+mall1.name+"\n location:"+mall1.location+"\n area:"+mall1.area+"\n brands:"+mall1.brands+"\n purpose:"+mall1.purpose+"\n no of floors:"+mall1.floors+"\n parking:"+mall1.parking);
	
	    System.out.println("============================================");
		Mall mall2=new Mall("Orian Mall","Bangalore","Yashwantpur");
		System.out.println("values for mall2");
		System.out.println("name:"+mall2.name+"\n location:"+mall2.location+"\n area:"+mall2.area+"\n brands:"+mall2.brands+"\n purpose:"+mall2.purpose+"\n no of floors:"+mall2.floors+"\n parking:"+mall2.parking);
	
	    System.out.println("============================================");
		Mall mall3=new Mall("Mall of Mysore","Mysore","IndiraNagar",5000,"Shopping",8,true);
		System.out.println("values for mall3");
		System.out.println("name:"+mall3.name+"\n location:"+mall3.location+"\n area:"+mall3.area+"\n brands:"+mall3.brands+"\n purpose:"+mall3.purpose+"\n no of floors:"+mall3.floors+"\n parking:"+mall3.parking);
	
		System.out.println("============================================");
		Park park1=new Park();
		System.out.println("values for park1");
		System.out.println("name:"+park1.name+"\n location:"+park1.location+"\n area:"+park1.area+"\n safari available:"+park1.safari+"\n zoo available:"+park1.zoo+"\n SafariFees:"+park1.safariFees+"zooFess:"+park1.zooFees+"\n parking:"+park1.parking+"established year:"+park1.year);
		
		System.out.println("============================================");
		Park park2=new Park("Cubbon Park","Bangalore","City Center");
		System.out.println("values for park2");
		System.out.println("name:"+park2.name+"\n location:"+park2.location+"\n area:"+park2.area+"\n safari available:"+park2.safari+"\n zoo available:"+park2.zoo+"\n SafariFees:"+park2.safariFees+"zooFess:"+park2.zooFees+"\n parking:"+park2.parking+"established year:"+park2.year);
	
		System.out.println("============================================");
		Park park3=new Park("Mysore Zoo","Mysore","City center",true,true,500,200,true,1892);
		System.out.println("values for park1");
		System.out.println("name:"+park3.name+"\n location:"+park3.location+"\n area:"+park3.area+"\n safari available:"+park3.safari+"\n zoo available:"+park3.zoo+"\n SafariFees:"+park3.safariFees+"zooFess:"+park3.zooFees+"\n parking:"+park3.parking+"established year:"+park3.year);
	}
}