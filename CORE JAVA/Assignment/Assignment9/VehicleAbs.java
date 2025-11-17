
abstract class Vehicle {
	 String Brand;
	 int Speed;
	 
	 Vehicle(){
		 System.out.println("  Vehicle Default Constructor Called");
		 this.Brand = "TATA";
		 this.Speed = 30;
		 
	 }
   Vehicle(String B,int S){
	   
	   System.out.println(" vehicle Parameterized Constructor Called");
	   this.Brand = B;
	   this.Speed = S;
   }
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public int getSpeed() {
	return Speed;
}
public void setSpeed(int speed) {
	Speed = speed;
}

abstract void brake();
void Display() {
	
	
	
	System.out.println("Brand is:"+this.Brand);
	System.out.println("Speed is:"+this.Speed);


}
}//vehicle end here
class Car extends Vehicle{
	int NoOfDoors;
	
	Car(){
		super();
		System.out.println(" Car Default Constructor Called");
		this.Brand ="MarutiSuzuki";
		this.Speed = 50;
		this.NoOfDoors = 4;
	}
	
	Car(String B,int S,int D){
		super(B,S);
		System.out.println(" Car Parameterized Constructor Called");
		
		this.Brand = B;
		this.Speed = S;
		this.NoOfDoors = D;
		
	}

	public int getNoOfDoors() {
		return NoOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		NoOfDoors = noOfDoors;
	}
	
	void brake() {
		System.out.println("Drum Brake Applied");
		
	}
	void Display() {
		
		
		
		super.Display();
		System.out.println("No of doors is:"+this.NoOfDoors);


	}
	
}//Car ends here 

class Bus extends Vehicle{
	int PassengerCapacity;
	
	Bus(){
		
		super();
		System.out.println(" Bus Default Constructor Called");
		this.Brand = "Mahindra";
		this.Speed = 58;
		this.PassengerCapacity = 40;
	
		
	}
	Bus(String B, int S, int P){
		super(B,S);
		System.out.println("Bus Parameterized Constructor Called");
		this.Brand = B;
		this.Speed = S;
		this.PassengerCapacity = P;
		
		
	}
	public int getPassengerCapacity() {
		return PassengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		PassengerCapacity = passengerCapacity;
	}
	void brake() {
		System.out.println("Air Brake Applied");
		
	}
void Display() {
		
		
		
		super.Display();
		System.out.println("PassengerCapacity is:"+this.PassengerCapacity);


	}
	

}//bus ends here

class Test0{
	
	public static void main(String[]args) {
		Vehicle V1; 
		//V1 = new Vehicle("Honda",90);
		//V1.brake();
		V1 =new Car ("HONDA",90,4);
		V1.brake();
		V1 =new Bus("Mahindra",50,40);
		V1.brake();
		
//		Vehicle v1 = new Vehicle();
//		v1.Display();
//		Vehicle v2 = new Vehicle("HONDA",90);
//		v2.Display();
//		
//		
//		Car c1 = new Car();
//		c1.Display();
//		Car c2 = new Car("HONDA",90,4);
//		c2.Display();
//		
//		Bus b1 = new Bus();
//		b1.Display();
//		Bus b2 = new Bus("Mahindra",50,40);
//		b2.Display();
		
	}//main end here
	
	
	
}//Test end here