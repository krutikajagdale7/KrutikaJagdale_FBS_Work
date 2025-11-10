class LibraryUser{
String Name;
int DaysLate;
static double FinePerDay = 2.0;

LibraryUser(){
System.out.println(" Default Constructor Called");


this.Name= "Krutika";
this.DaysLate = 44;

}
LibraryUser(String N, int D){
System.out.println(" Parameterized Constructor Called");

this.Name = N;
this.DaysLate = D;
}
void setName(String N){
this.Name = N;
}
void setFinePerDay(int D){
this.DaysLate = D;
}
static void setFinePerDay(double FPD){
	FinePerDay = FPD;
}
double ClaculateFine(){
	return DaysLate * FinePerDay;

}
String getName(){
return this. Name;

}
int getDaysLate(){
return this.DaysLate;

}
double getFinePerDay()
{
	return this.FinePerDay;
}

void Display(){

System.out.println("Name:"+this.Name);

System.out.println("DaysLate:"+this.DaysLate);

System.out.println("Fine:"+this.ClaculateFine());

}

}//library End Here
class Test{
public static void main(String [] args){
LibraryUser L1 = new LibraryUser("ABC",5);
LibraryUser L2 = new LibraryUser();
LibraryUser.setFinePerDay(5.0);

L1.Display();
L2.Display();

L1.ClaculateFine();
L2.ClaculateFine();



}//main end here
}//Test end here