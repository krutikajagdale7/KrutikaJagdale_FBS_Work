class Car{
String Model;
String Brand;
double Price;
String Color;
int FuelCapacity;

void SetModel(String M){
	this.Model = M;

}
void SetBrand(String B){

	this.Brand = B;
}
void SetPrice(double P){

	this.Price = P;
}
void SetColor(String C){
	this.Color = C;
}
void SetFuelCapacity(int FC){
	this.FuelCapacity = FC;
}
String getModel(){
	return this.Model;

}
String getBrand()
{
	return this.Brand;
}
double getPrice()
{

	return this.Price;

}
String getColor()
{
	return this.Color;
}
int getFuelCapacity()
{
	return this.FuelCapacity;
}
void Display(){
	

System.out.println("Model:"+this.Model+"\nBrand:"+this.Brand+"\nPrice:"+this.Price+"\nColor:"+this.Color+"\nFuelCapacity:"+this.FuelCapacity);

}
}//car ends here
class TestCar{
public static void main(String[] args){

	Car C1, C2;
        C1= new Car();
	C2= new Car();

	C1.SetModel("P U N C H");
	C1.SetBrand("TATA");
	C1.SetPrice(900000);
	C1.SetColor("Gray");
	C1.SetFuelCapacity(500);

	C1.SetModel("SWIFT");
	C1.SetBrand("MARUTISUZIKI");
	C1.SetPrice(600000);
	C1.SetColor("White");
	C1.SetFuelCapacity(400);
	System.out.println("\nHere C1 Object Start ->");

	C1.getModel();
	C1.getBrand();
	C1.getPrice();
	C1.getColor();
	C1.getFuelCapacity();
	C1.Display();

System.out.println("-------------------------------------");
System.out.println("\nHere C2 Object Start ->");
	C2.getModel();
	C2.getBrand();
	C2.getPrice();
	C2.getColor();
	C2.getFuelCapacity();
	C2.Display();
	


//System.out.println("Model:"+C1.Model+"\nBrand:"+C1.Brand+"\nPrice:"+C1.Price+"\nColor:"+C1.Color+"\nFuelCapacity:"+C1.FuelCapacity);

}//main ends here

}//TestCar ends here


