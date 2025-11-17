
abstract class Defence {
String NameOfHead;
int NoOfTroops;
int NoOfVehicle;
int NoofMissionPerformed;
double Budget;
String CountryName;
int ManPowerCount;
String LocationOfHeadQuartor;
int DeptCount;

Defence()
{

System.out.println(" Defenc Default Constructor");
this.NameOfHead ="ABC";
this.NoOfTroops = 2500;
this.NoOfVehicle = 1200;
this.NoofMissionPerformed = 85;
this.Budget= 75000;
this.CountryName = "India";
this.ManPowerCount = 100;
this.LocationOfHeadQuartor = "Delhi";
this.DeptCount = 12;

}
 Defence(String H, int T, int V, int MP, double Bud, String CN,int MPC, String L,int DC)
 {
	
	System.out.println(" Defenc Parametrized  Constructor");
	this.NameOfHead = H;
	this.NoOfTroops = T;
	this.NoOfVehicle = V;
	this.NoofMissionPerformed = MP;
	this.Budget = Bud;
	this.CountryName = CN;
	this.ManPowerCount = MPC;
	this.LocationOfHeadQuartor = L;
	this.DeptCount = DC;

	
 }


 public String getNameOfHead() {
	return NameOfHead;
}
public void setNameOfHead(String nameOfHead) {
	NameOfHead = nameOfHead;
}
public int getNoOfTroops() {
	return NoOfTroops;
}
public void setNoOfTroops(int noOfTroops) {
	NoOfTroops = noOfTroops;
}
public int getNoOfVehicle() {
	return NoOfVehicle;
}
public void setNoOfVehicle(int noOfVehicle) {
	NoOfVehicle = noOfVehicle;
}
public int getNoofMissionPerformed() {
	return NoofMissionPerformed;
}
public void setNoofMissionPerformed(int noofMissionPerformed) {
	NoofMissionPerformed = noofMissionPerformed;
}
public double getBudget() {
	return Budget;
}
public void setBudget(double budget) {
	Budget = budget;
}
public String getCountryName() {
	return CountryName;
}
public void setCountryName(String countryName) {
	CountryName = countryName;
}
public int getManPowerCount() {
	return ManPowerCount;
}
public void setManPowerCount(int manPowerCount) {
	ManPowerCount = manPowerCount;
}
public String getLocationOfHeadQuartor() {
	return LocationOfHeadQuartor;
}
public void setLocationOfHeadQuartor(String locationOfHeadQuartor) {
	LocationOfHeadQuartor = locationOfHeadQuartor;
}
public int getDeptCount() {
	return DeptCount;
}
public void setDeptCount(int deptCount) {
	DeptCount = deptCount;
}
abstract void attack();

void Dispaly() {
	 System.out.println("NameOfHead is:"+this.NameOfHead);
		System.out.println("NoOfTroops:"+this.NoOfTroops);
		System.out.println("NoOfVehicle:"+this.NoOfVehicle);
		System.out.println("NoofMissionPerformed is:"+this.NoofMissionPerformed);
		System.out.println("Budget is:"+this.Budget);
		System.out.println("CountryName:"+this.CountryName);
		System.out.println("ManPowerCount is:"+this.ManPowerCount);
		System.out.println("LocationOfHeadQuartor is:"+this.LocationOfHeadQuartor);
		System.out.println("DeptCount is:"+this.DeptCount);
		
 }
public String toString(){

	return "\nNoOfTroops:"+this.NoOfTroops+"NoOfVehicle:"+this.NoOfVehicle+"NoofMissionPerformed is:"+this.NoofMissionPerformed+"Budget is:"+this.Budget+"CountryName:"+this.CountryName+"ManPowerCount is:"+this.ManPowerCount+"LocationOfHeadQuartor is:"+this.LocationOfHeadQuartor+"DeptCount is:"+this.DeptCount;
}
	 
}//defence end here
class Army extends Defence{
int NoOfguns;
int NoOfTanks;
int NoOfBattalion;
int NoofGrenade;
	
	Army(){
		super();
		System.out.println(" Army Default  Constructor");
		this.NoOfguns= 80;
		this.NoOfTanks = 100;
		this.NoOfBattalion = 300;
		this.NoofGrenade = 470;
	}
	Army(String H, int T, int V, int MP, double Bud, String CN, int MPC, String L, int DC, int G, int TA, int BT, int GR){
		 super(H, T, V, MP, Bud, CN, MPC, L, DC);
		
		System.out.println(" Army Parameterized Constructor");
		this.NoOfguns= G;
		this.NoOfTanks = TA;
		this.NoOfBattalion = BT;
		this.NoofGrenade = GR;
	}
	public int getNoOfguns() {
		return NoOfguns;
	}
	public void setNoOfguns(int noOfguns) {
		NoOfguns = noOfguns;
	}
	public int getNoOfTanks() {
		return NoOfTanks;
	}
	public void setNoOfTanks(int noOfTanks) {
		NoOfTanks = noOfTanks;
	}
	public int getNoOfBattalion() {
		return NoOfBattalion;
	}
	public void setNoOfBattalion(int noOfBattalion) {
		NoOfBattalion = noOfBattalion;
	}
	public int getNoofGrenade() {
		return NoofGrenade;
	}
	public void setNoofGrenade(int noofGrenade) {
		NoofGrenade = noofGrenade;
	}
	
	void attack(){
		
		
		System.out.println("Attack by using Shoot");

	}

	void Display() {
	super.Dispaly();
	System.out.println("NoOfguns:"+this.NoOfguns);
	System.out.println("NoOfTanks:"+this.NoOfTanks);
	System.out.println("NoOfBattalion is:"+this.NoOfBattalion);
	System.out.println("NoofGrenade is:"+this.NoofGrenade);

	}
}//army end here
class Navy extends Defence{
int NoOfships;
int NoOfSubmarine;//underwater ship
int NoOfTorpeods;

Navy(){
	super();
	System.out.println("Navy Default  Constructor");
	this.NoOfships = 800;
	this.NoOfSubmarine = 500;
	this.NoOfTorpeods = 400;
	
	
}
Navy(String H, int T, int V, int MP, double Bud, String CN, int MPC, String L, int DC, int S, int Sub, int Tor){
	super(H,T,V,MP,Bud,CN,MPC,L,DC);
	System.out.println("Navy Parameterized  Constructor");
	this.NoOfships = S;
	this.NoOfSubmarine = Sub;
	this.NoOfTorpeods = Tor;
	
	
}
public int getNoOfships() {
	return NoOfships;
}
public void setNoOfships(int noOfships) {
	NoOfships = noOfships;
}
public int getNoOfSubmarine() {
	return NoOfSubmarine;
}
public void setNoOfSubmarine(int noOfSubmarine) {
	NoOfSubmarine = noOfSubmarine;
}
public int getNoOfTorpeods() {
	return NoOfTorpeods;
}
public void setNoOfTorpeods(int noOfTorpeods) {
	NoOfTorpeods = noOfTorpeods;
}
void attack(){
	
	
	System.out.println("Attack by using Torpeods");

}


void Dispaly() {
	super.Dispaly();
	 	super.Dispaly();
		System.out.println("NoOfships:"+this.NoOfships);
		System.out.println("NoOfSubmarine:"+this.NoOfSubmarine);
		System.out.println("NoOfTorpeods is:"+this.NoOfTorpeods);
		
		
 }
	
}//Navy end here
class AirForce extends Defence{
	
	int NoOfjates;
	int NoOfMissiels;
	int NoOfSquadron;
	String Aircraft;
	
	
	AirForce()
	{
		super();
		System.out.println("AirForce Default Constructor");
		this.NoOfjates = 90;
		this.NoOfMissiels = 60;
		this.NoOfSquadron = 77;
		this.Aircraft = "DDD";
		
		
		
	}	
	AirForce(String H, int T, int V, int MP, double Bud, String CN, int MPC, String L, int DC, int J, int Miss, int Sq, String AirC) {
	    super(H, T, V, MP, Bud, CN, MPC, L, DC);
		System.out.println("AirForce Default Constructor");
		this.NoOfjates = J;
		this.NoOfMissiels = Miss;
		this.NoOfSquadron = Sq;
		this.Aircraft = AirC;
		
		
		
	}
	public int getNoOfjates() {
		return NoOfjates;
	}
	public void setNoOfjates(int noOfjates) {
		NoOfjates = noOfjates;
	}
	public int getNoOfMissiels() {
		return NoOfMissiels;
	}
	public void setNoOfMissiels(int noOfMissiels) {
		NoOfMissiels = noOfMissiels;
	}
	public int getNoOfSquadron() {
		return NoOfSquadron;
	}
	public void setNoOfSquadron(int noOfSquadron) {
		NoOfSquadron = noOfSquadron;
	}
	public String getAircraft() {
		return Aircraft;
	}
	public void setAircraft(String aircraft) {
		Aircraft = aircraft;
	}	
	void attack(){
		
		
		System.out.println("Attack by using Missiels");

	}

	void Dispaly() {
		super.Dispaly();
		 
			System.out.println("NoOfJates:"+this.NoOfjates);
			System.out.println("NoOfMissiels:"+this.NoOfMissiels);
			System.out.println("NoOfSquadron is:"+this.NoOfSquadron);
			System.out.println("Aircraft is:"+this.Aircraft);
			
	 }
		 
}//airforce end here


class TestDefence {
	
	public static void main(String[] args) {
		
		Defence D1; 
		//D1= new Defence();
		//D1.attack();
		D1 =new Army ();
		D1.attack();
		D1 =new Navy();
		D1.attack();
		D1 =new AirForce();
		D1.attack();
		System.out.println(D1);
		System.out.println(D1.toString());
			
	

		
//		Defence d1 = new Defence();
//		d1.Dispaly();
//		Defence d2 = new Defence("General Arjun Singh", 25000, 1200, 85, 75000000.50, "India", 26000, "New Delhi", 12);
//		d2.Dispaly();
//		
//		Army a1 = new Army();
//		a1.Dispaly();
//		Army a2 = new Army("General Arjun Singh", 25000, 1200, 85, 75000000.50, "India", 26000, "New Delhi", 12,100,200,300,400);
//		a2.Dispaly();
//		
//		Navy n1 = new Navy();
//		n1.Dispaly();
//		Navy n2 = new Navy("xyz", 25000, 1200, 85, 75000000.50, "India", 26000, "New Delhi", 12,101,201,301);
//		n2.Dispaly();
//		
//		AirForce f1 = new AirForce();
//		f1.Dispaly();
//		AirForce f2 = new AirForce("General ", 25000, 1200, 85, 75000000.50, "India", 26000, "New Delhi", 12,102,203,304,"ttt");
//		f2.Dispaly();
		
	}
	
	
	
	
}