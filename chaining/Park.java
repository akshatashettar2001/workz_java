class Park{
	
	String name="Bannerugahatta National Park";
	String location="Bangalore";
	String area="Bannerugahatta";
	boolean safari=true;
	boolean zoo=true;
	double safariFees=400;
	int zooFees=100;
	boolean parking=true;
	int year=1971;
	
	
	
	Park(){
		System.out.println("invoking no-arg constr of Park");
	}
	Park(String name){
		System.out.println("invoking String constr of Park");
	    this.name=name;

	}
	
	Park(String name,String location){
		this(name);
		System.out.println("invoking String,String constr of Park");
		this.location=location;
	}
	Park(String name,String location,String area){
		this(name,location);
		System.out.println("invoking String,String ,String constr of Park");
	    this.area=area;
	}
	Park(String name,String location,String area,boolean safari){
		this(name,location,area);
		System.out.println("invoking String,String ,String ,boolean constr of Park");
		this.safari=safari;
	}
	Park(String name,String location,String area,boolean safari,boolean zoo){
		this(name,location,area,safari);
		System.out.println("invoking String,String ,String ,boolean,boolean constr of Park");
		this.zoo=zoo;
	}
	Park(String name,String location,String area,boolean safari,boolean zoo,double safariFees){
		this(name,location,area,safari,zoo);
		System.out.println("invoking String,String ,String ,boolean,boolean,double constr of Park");
		this.safariFees=safariFees;
	}
	Park(String name,String location,String area,boolean safari,boolean zoo,double safariFees,boolean parking){
		this(name,location,area,safari,zoo,safariFees);
		System.out.println("invoking String,String ,String ,double,double,int,boolean constr of Park");
		this.parking=parking;
	}
	Park(String name,String location,String area,boolean safari,boolean zoo,double safariFees,int zooFees,boolean parking,int year){
		this(name,location,area,safari,zoo,safariFees,parking);
		System.out.println("invoking String,String ,String ,double,double,int,boolean,int constr of Park");
		this.year=year;
		this.zooFees=zooFees;
	}	
	
}