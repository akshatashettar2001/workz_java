class Wood{
	String material="Solid Wood";
	double thickness=3;
	double size=8;
	double pieces=50;
	double price=5000;
	
	Wood(String material){
		System.out.println("invoking String constr of Wood");
		this.material=material;
	}
	Wood(String material,double thickness){
		this(material);
		this.thickness=thickness;
		System.out.println("invoking String,double constr of Wood");

	}
	Wood(String material,double thickness,double size){
		this(material,thickness);
		this.size=size;
		System.out.println("invoking String,double,double constr of Wood");

	}
	Wood(String material,double thickness,double size,double pieces){
		this(material,thickness,size);
		this.pieces=pieces;
		System.out.println("invoking String,double,double,double constr of Wood");
		
	}
	Wood(String material,double thickness,double size,double pieces,double price){
		this(material,thickness,size,pieces);
		this.price=price;
		System.out.println("invoking String,double,double,double ,double constr of Wood");

	}
}