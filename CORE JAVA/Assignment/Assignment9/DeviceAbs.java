

 abstract class ElectricDevice {
	 String Brand;
	 double price;
	 int power;
	 String color;
	 
	 
	 ElectricDevice()
{
		 System.out.println(" Eletric device Default Constructor Called");
		 this.Brand = "Lenovo";
		 this.price = 60000;
		 this.power = 30;
		 this.color = "Black";


}
	 ElectricDevice(String B,double P,int POW, String C)
	 {
		 
		 System.out.println(" Eletric deviceParameterized Constructor Called");
		 this.Brand = B;
		 this.price = P;
		 this.power = POW;
		 this.color = C;
		 
		 
	 }
	 public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	abstract void switchOnOff();
 void Display()
 {
	 
	 	System.out.println("Brand name  is:"+this.Brand);
	 	System.out.println("Price is:"+this.price);
	 	System.out.println("Power is:"+this.power);
	 	System.out.println("color is:"+this.color);

	 	
 } 
public String toString(){
	return"\n Brand name  is:"+this.Brand+"Price is:"+this.price+"Power is:"+this.power+"color is:"+this.color;
}
 }//ElectricDevice is end here
class Laptop extends ElectricDevice {
	int ram;
	int storage;
	String Processor;
	
	Laptop(){
		
		super();
		 System.out.println("Laptop Default Constructor Called");
		 
		 this.Brand = "Lenovo";
		 this.price = 60000;
		 this.power = 30;
		 this.color = "Black";
		 this.ram = 16;
		 this.storage =576;
		 this.Processor ="intel";

		
		
	}
	
	Laptop(String B,double P,int POW, String C, int R, int S, String str){
		 super(B,P,POW,C);
		 System.out.println(" Laptop Parameterized Constructor Called");
		 this.Brand = B;
		 this.price = P;
		 this.power = POW;
		 this.color = C;
		 this.ram = R;
		 this.storage =S;
		 this.Processor = str;
		 		 
	}
	
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	void switchOnOff() {
	    System.out.println("Laptop is turning ON/OFF using power button.");
	}

	
	
 void Display()
	 {
		 	super.Display();
		 	System.out.println("Ram is:"+this.ram);
		 	System.out.println("Storage is:"+this.storage);
		 	System.out.println("Processoris:"+this.Processor);

		 	
	 } 
	
	
}//laptop end here
class Mobile extends ElectricDevice {
	int batteryCpacity;
	double ScreenSize;
	Mobile(){
		
		super();
		System.out.println(" mobile Default Constructor Called");
		this.Brand = "Lenovo";
		 this.price = 60000;
		 this.power = 30;
		 this.color = "Black";
		 
		
	}
	Mobile(String B,double P,int POW, String C,int BC, double SZ){
		
		super(B,P,POW,C);
		System.out.println(" mobile Parameterized Constructor Called");
		 this.Brand = B;
		 this.price = P;
		 this.power = POW;
		 this.color = C;
		 this.batteryCpacity = BC;
		 this.ScreenSize = SZ;
		
	}
	public int getBatteryCpacity() {
		return batteryCpacity;
	}
	public void setBatteryCpacity(int batteryCpacity) {
		this.batteryCpacity = batteryCpacity;
	}
	public double getScreenSize() {
		return ScreenSize;
	}
	public void setScreenSize(double screenSize) {
		ScreenSize = screenSize;
	}
	@Override
	void switchOnOff() {
	    System.out.println("Mobile is turning ON/OFF using power button.");
	}

	
	void Display()
	 {
		 	super.Display();
		 	System.out.println( "batteryCpacity is:"+this.batteryCpacity);
		 	System.out.println("ScreenSizeis:"+this.ScreenSize);
		 	

		 	
	 } 
	
	
}//mobile end here
class Test4{
	public static void main(String [] args) {
		ElectricDevice e1 ;
		//e1 = new ElectricDevice("HP",40000,240,"Black");
		//e1.Display();
		//e1.switchOnOff();
		e1 = new Laptop("HP",50000,240,"white",16,576,"intel");
		e1.Display();
		e1.switchOnOff();
		e1 = new Mobile("Samsung",20000,50,"voilet",5000,2.5);
		e1.Display();
		e1.switchOnOff();
		System.out.println(e1);
		System.out.println(e1.toString());
		
		
//		ElectricDevice e2 = new ElectricDevice("HP", 900000, 80,"Black");
//		
//		Laptop l1 =new Laptop();
//		l1.Display();
//		Laptop l2 = new Laptop("Samsung",50000,70,"Brown",16,576,"Rizan");
//		l2.Display();
//		
//		Mobile m1 =new Mobile();
//		m1.Display();
//		Mobile m2 = new Mobile("Vivo", 30000,45,"white",5000,5.5);
//		m2.Display();
		
	}//main end here
}//test end here