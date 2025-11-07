import java.util.Scanner;

class Distance{
 int KM;
 int M;

Distance(){

System.out.println(" Default Constructor Called");
this.KM = 100;
this.M = 50;

}

Distance(int km, int m)//Parameterizedconstructor
{

System.out.println(" Parameterized Constructor Called");
System.out.println(" --Deatils Of Distance--");

this.KM =km;
this.M= m;

}

void SetKM(int km){
  this.KM = km;
}
void SetM(int m){
	this.M=m;
}
int getKM(){
	return this.KM;

}
int getM()
{
	return this.M;
}

void Display(){
	System.out.println("KM is:"+this.KM);
	System.out.println("M is:"+this.M);

}

}//Distance ends here

class TestDistance
{	 public static void main(String[]args){
	Distance D1, D2;
	D1 =new Distance();
	D2 =new Distance(200,70);
	D1.SetKM(100);
	D1.SetM(50);
	System.out.println("\nHere D1 Object Start ->");

	D2.SetKM(200);
	D2.SetM(70);
 
	D1.getKM();
	D1.getM();
	D1.Display();
	System.out.println("-------------------------------------");
	System.out.println("\nHere D2 Object Start ->");
	D2.getKM();
	D2.getM();
	D2.Display();

Scanner sc = new Scanner(System.in);
System.out.println("Here Enter Details of Distance-----------");
System.out.println("Enter the KM:");
int a= sc.nextInt();
sc.nextLine();
System.out.println("Enter the M:");
int b= sc.nextInt();
Distance D3 = new Distance(a,b);

D3.Display();



//System.out.println("KM:"+D1.KM+"\nM:"+D1.M);
}//main ends here 

}//TestDistance Ends here