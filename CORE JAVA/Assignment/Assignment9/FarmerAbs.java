
 abstract class Farmer {
	 int FarmerID;
	 String FarmerName;
	 double LandArea;
	 String City;
	 double AnnualIncome;
	 int NoOfEquipment;
	 double InsuranceAmount;
	 
	 
	 Farmer()
	 {
		 System.out.println("Farmer Default Constructor ");
		 this.FarmerID = 101;
		 this.FarmerName = "ABC";
		 this.LandArea = 5.5;
		 this.City = "Nagar";
		 this.AnnualIncome = 57000.890;
		 this.NoOfEquipment = 5;
		 this.InsuranceAmount = 6000.700;
		
	 }	 
	 Farmer(int ID, String FN, double LA, String C,double AI, int E, double IA)
	 {
		 System.out.println("Farmer Paramerteized Constructor ");
		 this.FarmerID = ID;
		 this.FarmerName = FN;
		 this.LandArea = LA;
		 this.City = C;
		 this.AnnualIncome = AI;
		 this.NoOfEquipment = E;
		 this.InsuranceAmount = IA;
		
	 }
	public int getFarmerID() {
		return FarmerID;
	}
	public void setFarmerID(int farmerID) {
		FarmerID = farmerID;
	}
	public String getFarmerName() {
		return FarmerName;
	}
	public void setFarmerName(String farmerName) {
		FarmerName = farmerName;
	}
	public double getLandArea() {
		return LandArea;
	}
	public void setLandArea(double landArea) {
		LandArea = landArea;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public double getAnnualIncome() {
		return AnnualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		AnnualIncome = annualIncome;
	}
	public int getNoOfEquipment() {
		return NoOfEquipment;
	}
	public void setNoOfEquipment(int noOfEquipment) {
		NoOfEquipment = noOfEquipment;
	}
	public double getInsuranceAmount() {
		return InsuranceAmount;
	}
	public void setInsuranceAmount(double insuranceAmount) {
		InsuranceAmount = insuranceAmount;
	}	 
	 void produce() {
		 
		 System.out.println("Produce Goods ");
	 }
	 abstract void CalSubsidy();
	 void Display() {
		 
				
				System.out.println("FarmerID is:"+this.FarmerID);
				System.out.println("FarmerName is:"+this.FarmerName);
				System.out.println("LandArea is:"+this.LandArea);
				System.out.println("City is:"+this.City);
				System.out.println("AnnualIncome is:"+this.AnnualIncome);
				System.out.println("NoOfEquipment is:"+this.NoOfEquipment);
				System.out.println("InsuranceAmount is"+this.InsuranceAmount);
			}
		 
public String toString(){
	return "\nFarmerID is:"+this.FarmerID+"FarmerName is:"+this.FarmerName+"LandArea is:"+this.LandArea+"City is:"+this.City+"AnnualIncome is:"+this.AnnualIncome+"NoOfEquipment is:"+this.NoOfEquipment+"InsuranceAmount is"+this.InsuranceAmount;
	
}
		 
	 
	 
}//farmer end here

 class DairyFarmer extends Farmer{
	 
	 int NoOFCattels;
	 double MilkProducedPerDay;
	 int LiseanNO;
	 
	 DairyFarmer(){
		 super();
		 System.out.println("DairyFarmer Default Constructor ");
		 this.NoOFCattels = 20;
		 this.MilkProducedPerDay = 100;
		 this.LiseanNO = 505;
		 
		 
	 }
	 
	 DairyFarmer(int ID, String FN, double LA, String C,double AI, int E, double IA,int Catt, double Milk,int LN){
		 super(ID,FN,LA,C,AI,E,IA);
		 System.out.println("DairyFarmer Paramaterized Constructor ");
		 this.NoOFCattels = Catt;
		 this.MilkProducedPerDay = Milk;
		 this.LiseanNO = LN;
		 
		 
	 }

	public int getNoOFCattels() {
		return NoOFCattels;
	}

	public void setNoOFCattels(int noOFCattels) {
		NoOFCattels = noOFCattels;
	}

	public double getMilkProducedPerDay() {
		return MilkProducedPerDay;
	}

	public void setMilkProducedPerDay(double milkProducedPerDay) {
		MilkProducedPerDay = milkProducedPerDay;
	}

	public int getLiseanNO() {
		return LiseanNO;
	}

	public void setLiseanNO(int liseanNO) {
		LiseanNO = liseanNO;
	}
 void produce() {
		 
		 System.out.println("Produce Milk ");
	 }
 void CalSubsidy() {
	 
	 System.out.println("Subsidy recived for Dairy");

 }
	void Display() {
		 
		
	super.Display();
		System.out.println("NoOFCattels is:"+this.NoOFCattels);
		System.out.println("MilkProducedPerDay is:"+this.MilkProducedPerDay);
		System.out.println("LiseanNO is"+this.LiseanNO);
	}
 
	 
 }//DairyFarmer end here
	
	class PoultryFarmer  extends Farmer{
		int NoOfChikens;
		int NoOfHeens;
		int NoOfShades;
		int EggProduced;
		int PoultryFormNo;
		 PoultryFarmer(){
			 super();
			 System.out.println("PoultryFarmer Default Constructor ");
			 	this.NoOfChikens = 20;
				this. NoOfHeens= 40;
				this.NoOfShades = 50;
				this.EggProduced = 60;
				this.PoultryFormNo = 8765;
			 
		 }
	
		 PoultryFarmer(int ID, String FN, double LA, String C,double AI, int E, double IA,int Chiken, int hen, int Sh, int Egg,int No  ){
			 super(ID,FN,LA,C,AI,E,IA);
			 System.out.println("PoultryFarmer Default Constructor ");
			 	this.NoOfChikens = 20;
				this. NoOfHeens= 40;
				this.NoOfShades = 50;
				this.EggProduced = 60;
				this.PoultryFormNo = 8765;
			 
		 }

		public int getNoOfChikens() {
			return NoOfChikens;
		}

		public void setNoOfChikens(int noOfChikens) {
			NoOfChikens = noOfChikens;
		}

		public int getNoOfHeens() {
			return NoOfHeens;
		}

		public void setNoOfHeens(int noOfHeens) {
			NoOfHeens = noOfHeens;
		}

		public int getNoOfShades() {
			return NoOfShades;
		}

		public void setNoOfShades(int noOfShades) {
			NoOfShades = noOfShades;
		}

		public int getEggProduced() {
			return EggProduced;
		}

		public void setEggProduced(int eggProduced) {
			EggProduced = eggProduced;
		}

		public int getPoultryFormNo() {
			return PoultryFormNo;
		}

		public void setPoultryFormNo(int poultryFormNo) {
			PoultryFormNo = poultryFormNo;
		}
		 void produce() {
			 
			 System.out.println("Produce Egg ");
		 }
		 void CalSubsidy() {
			 
			 System.out.println("Subsidy recived for Poultry");

		 }
	
	void Display() {
		
		
		super.Display();
		System.out.println("NoOfChikens is:"+this.NoOfChikens);
		//System.out.println("NoOfChikens is:"+this.NoOfChikens);
		System.out.println("NoOfHeens is"+this.NoOfHeens);
		System.out.println("NoOfShades is:"+this.NoOfShades);
		System.out.println("PoultryFormNo is"+this.PoultryFormNo);
		
	}
	
	}//PoultryFarmer end here
	
	class OrganicFarmer  extends Farmer{
		
		int OrganicFarmID;
		String CropType;
		double fertilizerUsed;
		
		OrganicFarmer(){
			super();
			 System.out.println("OrganicFarmer Default Constructor ");
			 this.OrganicFarmID = 678;
			 this.CropType="Sugarcain";
			 this.fertilizerUsed = 7.8;

		}
		OrganicFarmer(int ID, String FN, double LA, String C,double AI, int E, double IA, int FID, String CT, double FU){
			super(ID,FN,LA,C,AI,E,IA);
			 System.out.println("OrganicFarmer Parameterized Constructor ");
			 this.OrganicFarmID = 678;
			 this.CropType="Sugarcain";
			 this.fertilizerUsed = 7.8;

		}
		public int getOrganicFarmID() {
			return OrganicFarmID;
		}
		public void setOrganicFarmID(int organicFarmID) {
			OrganicFarmID = organicFarmID;
		}
		public String getCropType() {
			return CropType;
		}
		public void setCropType(String cropType) {
			CropType = cropType;
		}
		public double getFertilizerUsed() {
			return fertilizerUsed;
		}
		public void setFertilizerUsed(double fertilizerUsed) {
			this.fertilizerUsed = fertilizerUsed;
		}	
		 void produce() {
			 
			 System.out.println("Produce Crop ");
		 }
		 void CalSubsidy() {
			 
			 System.out.println("Subsidy recived for OrganicFarm");

		 }
		void Display() {
			
			super.Display();
			System.out.println("OrganicFarmID is:"+this.OrganicFarmID);
			System.out.println("CropType is:"+this.CropType);
			System.out.println("fertilizerUsed is"+this.fertilizerUsed);
			
			
			
		}
	}
	
	class TestFarmer{
		
		public static void main(String [] args) {
			Farmer F1 ;
			//F1 = new Farmer();
			//F1.produce();
			//F1.CalSubsidy();
			 F1 = new DairyFarmer();
			F1.produce();
			F1.CalSubsidy();
			
			F1 = new PoultryFarmer();
			F1.produce();
			F1.CalSubsidy();
			F1 = new OrganicFarmer();
			F1.produce();
			F1.CalSubsidy();
			System.out.println(F1);
			System.out.println(F1.toString());


			

//			Farmer f1 = new Farmer();
//			f1.Display();
//			Farmer f2 = new Farmer(102,"ABC",4.4,"Pune",100000,6,50000);		
//			f2.Display();
//			
//			DairyFarmer df1 = new DairyFarmer();
//			df1.Display();
//			DairyFarmer df2 = new DairyFarmer(102,"ABC",4.4,"Pune",100000,6,50000,90,50,666);
//			df2.Display();
//			
//			PoultryFarmer pf1 = new PoultryFarmer();
//			pf1.Display();
//			PoultryFarmer pf2 = new PoultryFarmer(102,"ABC",4.4,"Pune",100000,6,50000,50,80,30,80,333);
//			pf2.Display();
//			
//			OrganicFarmer of1 = new OrganicFarmer();
//			of1.Display();
//			OrganicFarmer of2 = new OrganicFarmer(102,"ABC",4.4,"Pune",100000,6,50000,888,"wheat",90);
//			of2.Display();
//			
			
			
		}//main ned here
		
		
		
		
		
	}//TestFarmer end here
	