class ElectricityBill{

static double RatePerUnit = 12;
String CustName;
int CustID;
int UnitConsumed;
//double CalculateBill;



ElectricityBill(){
System.out.println(" Default Constructor Called");
this.CustID =101;
this.CustName ="ABC";
this.UnitConsumed = 67;

}
ElectricityBill(String N,int CID, int UC){

System.out.println(" Parameterized Constructor Called");
this.CustID=CID;
this.CustName=N;
this.UnitConsumed = UC;

}
static void SetRatePerUnit(double RPU){

	RatePerUnit = RPU ;
}
void SetCustName(String N){
this.CustName = N;

}
void SetCustID(int CID){
	this.CustID = CID;
}
void SetUnitConsumed(int UC){
	this.UnitConsumed = UC;
}
double CalculateBill(){
return UnitConsumed * RatePerUnit;
}

double getRatePerUnit()
{
	return RatePerUnit;
}

String getCustName(){
	return this.CustName;
}
int getCustID(){
	return this.CustID;
}
int getUnitConsumed(){
	return this.UnitConsumed;

}
void Display()
{
System.out.println("RatePerUnit:"+this.RatePerUnit);

System.out.println("Customer Name:"+this.CustName);

System.out.println("CustomerID:"+this.CustID);

System.out.println("unit Consumed:"+this.UnitConsumed);

System.out.println(" Total CalculateBill:"+CalculateBill());


}
}//ElectricityBill class end here

class Test{
public static void main(String[] args){
	ElectricityBill e1 = new ElectricityBill("krutika",1,300);
	ElectricityBill e2 = new ElectricityBill();
 	ElectricityBill.SetRatePerUnit(12);
e1.CalculateBill();
e2.CalculateBill();
e1.Display();
e2.Display();
}//main end here

}//Test end here


