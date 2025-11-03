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
}//car ends here
class TestCar{
public static void main(String[] args){

	Car C1;
        C1= new Car();
	C1.SetModel("P U N C H");
	C1.SetBrand("TATA");
	C1.SetPrice(900000);
	C1.SetColor("Gray");
	C1.SetFuelCapacity(500);
System.out.println("Model:"+C1.Model+"\nBrand:"+C1.Brand+"\nPrice:"+C1.Price+"\nColor:"+C1.Color+"\nFuelCapacity:"+C1.FuelCapacity);

}//main ends here

}//TestCar ends here


