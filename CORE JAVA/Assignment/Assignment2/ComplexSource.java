class Complex{
int real;
int imaginary;

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
	C2 = new Complex();
	C1.SetReal(5);
        C1.SetImaginary(6);

	C2.SetReal(3);
        C2.SetImaginary(7);
	System.out.println("\nHere C2 Object Start ->");

	C1.getReal();
        C1.getImaginary();
	C1.Display();
	
	System.out.println("-------------------------------------");
	System.out.println("\nHere C2 Object Start ->");
	C2.getReal();
        C2.getImaginary();
	C2.Display();


//System.out.println("Real and Imaginary:"+C.real+"+"+C.imaginary+"i");

}//main ends here

}//TestComplex Ends Here