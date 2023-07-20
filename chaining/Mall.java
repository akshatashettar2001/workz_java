class Mall{
	
	String name="Manthri Mall";
	String location="Bangalore";
	String area="Malleshwaram";
	double brands=10000;
	String purpose="Shopping";
	int floors=15;
	boolean parking=true;
	
	
	Mall(){
		System.out.println("invoking no-arg constr of Mall");
	}
	
	Mall(String name,String location){
		System.out.println("invoking String,String constr of Mall");
	    this.name=name;
		this.location=location;
	}
	Mall(String name,String location,String area){
		this(name,location);
		System.out.println("invoking String,String ,String constr of Mall");
	    this.area=area;
	}
	Mall(String name,String location,String area,double brands){
		this(name,location,area);
		System.out.println("invoking String,String ,String ,double constr of Mall");
		this.brands=brands;
	}
	Mall(String name,String location,String area,double brands,String purpose){
		this(name,location,area,brands);
		System.out.println("invoking String,String ,String ,double,double constr of Mall");
		this.purpose=purpose;
	}
	Mall(String name,String location,String area,double brands,String purpose,int floors){
		this(name,location,area,brands,purpose);
		System.out.println("invoking String,String ,String ,double,double,int constr of Mall");
		this.floors=floors;
	}
	Mall(String name,String location,String area,double brands,String purpose,int floors,boolean parking){
		this(name,location,area,brands,purpose,floors);
		System.out.println("invoking String,String ,String ,double,double,int,boolean constr of Mall");
		this.parking=parking;
	}
		
	
}