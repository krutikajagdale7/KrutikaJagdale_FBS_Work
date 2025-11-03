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
	
}//product Ends Here
class TestProduct{
public static void main(String[] args){
	Product p1;
	p1=new Product();
	p1.SetProductID(500);
	p1.SetProductName("Sugar");
	p1.SetPrice(30);
	p1.SetQuantity(1);
System.out.println("ProductID:"+p1.ProductID+"\nProductName:"+p1.PName+"\nPrice:"+p1.Price+"\nQuantity:"+p1.Quantity);
}//main ends here
}//TestProduct ends here