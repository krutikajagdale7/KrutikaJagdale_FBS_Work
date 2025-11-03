class Product{

int ProductID;
String PName;
double Price;
double Quantity;

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
	p1=new Product();
	p2=new Product();
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