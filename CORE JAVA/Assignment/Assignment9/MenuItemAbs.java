
abstract class MenuItem{
	String name;
	double price;
	String category;
	
	MenuItem(){
	 System.out.println("Menuitem Default Constructor");
	this.name = "Paneer masala";
	this.price = 500;
	this.category = "Food";
	
	
}
	MenuItem(String N, double P, String C){
		 System.out.println("Menuitem Parameterized Constructor");
		this.name = N;
		this.price = P;
		this.category = C;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	void Display() {
		
		System.out.println("name is:"+this.name);
		System.out.println(" price is:"+this.price);
		System.out.println("category "+this.category);
		
		
	}
	abstract double calculatePrice() ;
	
	public String toString(){
		return "\nname is:"+this.name+" price is:"+this.price+"category "+this.category;

}
}//MenuItem end here

class FoodItem extends MenuItem {
    boolean isVegetarian;
    int calories;
    FoodItem(){
    	super();
   	 System.out.println("FoodItem Default Constructor");
   	 this.isVegetarian = true;
   	 this.calories = 20;
    	
    }
    FoodItem(String N, double P, String C,boolean V, int Ca){
    	super(N,P,C);
   	 System.out.println("FoodItemParameterized Constructor");
   	 this.isVegetarian = V;
   	 this.calories = Ca;
    	
    }
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	double calculatePrice() {
	    double total = price;

	    if(isVegetarian) {
	        total = total - price * 0.10;   // 10% discount
	    }

	    if(calories > 300) {
	        total = total + 20;             // extra charges
	    }

	    return total;
	}
    void Display() {
    	super.Display();
    	System.out.println("isVegetarian is:"+this.isVegetarian);
		System.out.println(" calories is:"+this.calories);
    	
    	
    }
    
    
    
}//FoodItem end here

class DrinkItem extends MenuItem {
    boolean isCold;
    int sizeInML;
    
    
    
    DrinkItem(){
    	super();
    	 System.out.println("DrinkItem Default Constructor");
    	this.isCold = true;
    	this.sizeInML =100;
    	
    }
    DrinkItem(String N, double P, String C,boolean CO, int SML){
    	super(N,P,C);
    	 System.out.println("DrinkItem Parameterized Constructor");
    	this.isCold = CO;
    	this.sizeInML =SML;
    	
    }
	public boolean isCold() {
		return isCold;
	}
	public void setCold(boolean isCold) {
		this.isCold = isCold;
	}
	public int getSizeInML() {
		return sizeInML;
	}
	public void setSizeInML(int sizeInML) {
		this.sizeInML = sizeInML;
	}
	double calculatePrice() {
	    double total = price;

	    if(isCold) {
	        total = total + 5;      // cold drink extra charge
	    }

	    if(sizeInML > 250) {
	        total = total + 10;     // bigger size = extra
	    }

	    return total;
	}
    void Display() {
    	
    	
    	super.Display();
    	System.out.println("isCold is:"+this.isCold);
		System.out.println(" sizeInML is:"+this.sizeInML);
    	
    }
}//DrinkItem end here

class DessertItem extends MenuItem {
    boolean hasSugarFreeOption;
    String flavor;
    
    
    DessertItem(){
    	super();
    	System.out.println("DessertItem Default Constructor");
    	this.hasSugarFreeOption = true;
    	this.flavor = "Vanila";
    
    }
    DessertItem(String N, double P, String C,boolean SF,String Fla){
    	super();
    	System.out.println("DessertItem Parameterized Constructor");
    	this.hasSugarFreeOption = SF;
    	this.flavor = Fla;
    
    }
	public boolean isHasSugarFreeOption() {
		return hasSugarFreeOption;
	}
	public void setHasSugarFreeOption(boolean hasSugarFreeOption) {
		this.hasSugarFreeOption = hasSugarFreeOption;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	double calculatePrice() {
	    double total = price;

	    if(hasSugarFreeOption) {
	        total = total + 20;   // sugar-free extra charge
	    }

	    if(flavor.equalsIgnoreCase("Chocolate")) {
	        total = total + 10;   // chocolate extra
	    }

	    return total;
	}
    
	void Display() {
		super.Display();
    	System.out.println("hasSugarFreeOption is:"+this.hasSugarFreeOption);
		System.out.println(" flavor is:"+this.flavor);	
		
	}
}//DessertItem end here

class TestMenu{
	
	public static void main(String[] args ){
		
		MenuItem M1 ;
		//M1= new MenuItem("Paneer",200,"food");
		//M1.Display();
		//System.out.println("Total Price:"+M1.calculatePrice());
		
		M1=new FoodItem("Paneer",200,"food",true,20);
		M1.Display();
		System.out.println("Total Price:"+M1.calculatePrice());
		
		M1= new DrinkItem("Paneer",200,"food",true,50);
		M1.Display();
		System.out.println("Total Price:"+M1.calculatePrice());		
		M1 = new DessertItem("Paneer",200,"food",false,"Mango");
		M1.Display();
		System.out.println("Total Price:"+M1.calculatePrice());
		System.out.println(M1);
		System.out.println(M1.toString());

		
		
//		MenuItem M1 = new MenuItem();
//		M1.Display();
//		MenuItem M2 = new MenuItem("Paneer",200,"food");
//		M2.Display();
//		
//		FoodItem F1 = new FoodItem();
//		F1.Display();
//		FoodItem F2 = new FoodItem("Paneer",200,"food",true,20);
//		F2.Display();
//		
//		DrinkItem D1 = new DrinkItem();
//		D1.Display();
//		DrinkItem D2 = new DrinkItem("Paneer",200,"food",true,50);
//		D2.Display();
//		
//		DessertItem DI1 = new DessertItem();
//		DI1.Display();
//		DessertItem DI2 = new DessertItem("Paneer",200,"food",false,"Mango");
//		DI2.Display();
//		
		
}//main end here	
	
	
}//Testmenu end here