
 class Accommodation {
    String name;
    String location;
    double pricePerNight;
    int capacity;          
    boolean hasWifi;
    Accommodation(){
    	System.out.println("Accommodation Default Constructor");
    	this.name = "GrandPalace";
    	this.location = "Pune";
    	this.pricePerNight = 1000;
    	this.capacity = 2;
    	this.hasWifi = true;
    	
    }
    Accommodation(String N, String L, double P, int C, boolean W){
    	System.out.println("Accommodation parameterized Constructor");
    	this.name = N;
    	this.location = L;
    	this.pricePerNight = P;
    	this.capacity = C;
    	this.hasWifi = W;
    	
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
    void Display() {
    	
    	System.out.println("name is:"+this.name);
		System.out.println(" location is:"+this.location);
		System.out.println("pricePerNight is  "+this.pricePerNight);
		System.out.println("capacity is:"+this.capacity);
		System.out.println("hasWifi is  "+this.hasWifi);
    	
    	
    }
}//Accommodation end here
 class Hotel extends Accommodation {
	    int starRating;        // 3-star, 5-star etc.
	    boolean hasSwimmingPool;
	    
	    Hotel(){
	    	
	    	super();
	    	System.out.println("Hotel Default Constructor");
	    	this.starRating = 3;
	    	this.hasSwimmingPool = true;
	    	
	    	
	    }
	    
	    Hotel(String N, String L, double P, int C, boolean W,int R,boolean SW){
	    	
	    	super(N,L,P,C,W);
	    	System.out.println("Hotel Parameterized Constructor");
	    	this.starRating = R;
	    	this.hasSwimmingPool = SW;
	    	
	    	
	    }

		public int getStarRating() {
			return starRating;
		}

		public void setStarRating(int starRating) {
			this.starRating = starRating;
		}

		public boolean isHasSwimmingPool() {
			return hasSwimmingPool;
		}

		public void setHasSwimmingPool(boolean hasSwimmingPool) {
			this.hasSwimmingPool = hasSwimmingPool;
		}
	    void Display() {
	    	
	    	super.Display();
	    	System.out.println("Rating is:"+this.starRating);
			System.out.println("hasSwimmingPool :"+this.hasSwimmingPool);
	    }
	    
	}//hotel end here
 
 class Cottage extends Accommodation {
	    boolean hasKitchen;
	    boolean isPetFriendly;
	    
	    
	    Cottage(){
	    	super();
 	System.out.println("Cottage Default Constructor");
 	this.hasKitchen = true;
 	this.isPetFriendly = true;
	    	
	    }
	    Cottage(String N, String L, double P, int C, boolean W,boolean K, boolean PF){
	    	super(N,L,P,C,W);
 	System.out.println("Cottage para Constructor");
 	this.hasKitchen = K;
 	this.isPetFriendly = PF;
	    
	   }
		public boolean isHasKitchen() {
			return hasKitchen;
		}
		public void setHasKitchen(boolean hasKitchen) {
			this.hasKitchen = hasKitchen;
		}
		public boolean isPetFriendly() {
			return isPetFriendly;
		}
		public void setPetFriendly(boolean isPetFriendly) {
			this.isPetFriendly = isPetFriendly;
		}
	    void Display() {
	    	
	    	super.Display();
	    	System.out.println("hasKitchen:"+this.hasKitchen);
			System.out.println("isPetFriendly :"+this.isPetFriendly);
	    	
	    }
	}//Cottage end here
 class Tent extends Accommodation {
	    boolean nearLake;
	    String fabricType;
	    
	    Tent(){
	    	super();
	    	System.out.println("Cottage Default Constructor");
	    	this.nearLake = true;
	    	this.fabricType = "Canvus";
	    }
	    Tent(String N, String L, double P, int C, boolean W,boolean NL,String FT){
	    	super(N,L,P,C,W);
	    	System.out.println("Cottage Default Constructor");
	    	this.nearLake = NL;
	    	this.fabricType = FT;
	    }
		public boolean isNearLake() {
			return nearLake;
		}
		public void setNearLake(boolean nearLake) {
			this.nearLake = nearLake;
		}
		public String getFabricType() {
			return fabricType;
		}
		public void setFabricType(String fabricType) {
			this.fabricType = fabricType;
		}
	    void Display() {
	    	
	    	
	    	super.Display();
	    	System.out.println("nearLake:"+this.nearLake);
			System.out.println("fabricType :"+this.fabricType);
	    	
	    }
	    
	}//Ten end here
 class TestAccommondation{
	 public static void main (String [] args) {
		 Accommodation A1 = new Accommodation();
			A1.Display();
		Accommodation A2 = new Accommodation("Royal Hotel","Mimbai",12000,5,true);
		A2.Display();
		 
		 Hotel H1 = new Hotel();
			H1.Display();
			Hotel H2 = new Hotel("Royal Hotel","Mimbai",12000,5,true,5,true);
		H2.Display();
		
		Cottage C1 = new Cottage();
			C1.Display();
			Cottage C2 = new Cottage("Royal Hotel","Mimbai",12000,5,true,true,true);
		C2.Display();
		
		Tent T1 = new Tent();
		T1.Display();
		Tent T2 = new Tent("Royal Hotel","Mimbai",12000,5,true,true,"Canvus");
	T2.Display();
	 }//main end here
	 
	 
 }//Accommondation end here