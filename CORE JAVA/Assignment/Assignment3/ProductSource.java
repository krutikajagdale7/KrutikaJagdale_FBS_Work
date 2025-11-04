class Product{

int ProductID;
String PName;
double Price;
double Quantity;

Product(){

System.out.println(" Default Constructor Called");
this.ProductID =10;
this.PName = "Sugar";
this.Price= 90;
this.Quantity = 1;
}
Product(int PID, String str,  double P1,double Q){

System.out.println(" Parameterized Constructor Called");
this.ProductID=PID;
this.PName=str;
this.Price=P1;
this.Quantity=Q;

}

void SetProductID(int PI){
	this.ProductID = PI;
}
void SetProductName(String PN){
	this.PName= PN;
}
void SetPrice(double P){
	this.Price = P;
}
void SetQuantity(double Q){
	this.Quantity = Q;

}
int getProductID()

{
	return this.ProductID;
}	
String getProductName()

{
	return this.PName;
}
double getPrice()
{
	return this.Price;
}
double getQuantity()
{
	return this.Quantity;
}
void Display()
{
	System.out.println("ProductID is:"+this.ProductID+"\nProduct Name is :"+this.PName+"\nPrice is:"+this.Price+"\nQuantity is:"+this.Quantity);
}
}//product Ends Here
class TestProduct{
public static void main(String[] args){
	Product p1,p2;
	p1 = new Product();
	p2 = new Product(501,"Sago",80,1);
	p1.SetProductID(500);
	p1.SetProductName("Sugar");
	p1.SetPrice(30);
	p1.SetQuantity(1);

	p2.SetProductID(501);
	p2.SetProductName("Sago");
	p2.SetPrice(80);
	p2.SetQuantity(1);
	System.out.println("\nHere p1 Object Start ->");
	

	p1.getProductID();
	p1.getProductName();
	p1.getPrice();
	p1.getQuantity();
	p1.Display();

	System.out.println("-------------------------------------");
	System.out.println("\nHere p2 Object Start ->");
	p2.getProductID();
	p2.getProductName();
	p2.getPrice();
	p2.getQuantity();
	p2.Display();

//System.out.println("ProductID:"+p1.ProductID+"\nProductName:"+p1.PName+"\nPrice:"+p1.Price+"\nQuantity:"+p1.Quantity);
}//main ends here
}//TestProduct ends here