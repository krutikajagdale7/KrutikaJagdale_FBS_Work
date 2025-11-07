import java.util.Scanner;
class Complex{
int real;
int imaginary;

Complex(){

System.out.println(" Default Constructor Called");
this.real = 5;
this.imaginary = 6;
}
Complex(int R,int I){

System.out.println(" Parameterized Constructor Called");
this.real=R;
this.imaginary=I;
}

void SetReal(int R){

	this.real = R;
}
void SetImaginary(int I){
	this.imaginary = I;
}
int getReal(){
	return this.real;
}
int getImaginary(){

	return this.imaginary;
}
void Display(){

	System.out.println("Real and Imaginary:"+this.real+"+"+this.imaginary+"i");

}
}//class complex ends here

class TestComplex{
public static void main(String[]args){
	Complex C1,C2;
        C1 = new Complex();
	C2 = new Complex(3,7);
	C1.SetReal(5);
        C1.SetImaginary(6);

	C2.SetReal(3);
        C2.SetImaginary(7);
	System.out.println("\nHere C1 Object Start ->");

	C1.getReal();
        C1.getImaginary();
	C1.Display();
	
	System.out.println("-------------------------------------");
	System.out.println("\nHere C2 Object Start ->");
	C2.getReal();
        C2.getImaginary();
	C2.Display();

Scanner sc = new Scanner(System.in);
System.out.println("Here Enter Details of ComplexNO:---");
System.out.println("Enter Real NO:");
int r = sc.nextInt();
System.out.println("EnterImaginary NO:");
int i = sc.nextInt();
Complex C3 =new Complex(r,i);

C3.Display();

//System.out.println("Real and Imaginary:"+C.real+"+"+C.imaginary+"i");

}//main ends here

}//TestComplex Ends Here