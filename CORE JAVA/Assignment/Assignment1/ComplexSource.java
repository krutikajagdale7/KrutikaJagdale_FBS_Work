class Complex{
int real;
int imaginary;

void SetReal(int R){

	this.real = R;
}
void SetImaginary(int I){
	this.imaginary = I;
}

}//class complex ends here

class TestComplex{
public static void main(String[]args){
	Complex C;
        C = new Complex();
	C.SetReal(5);
        C.SetImaginary(6);
System.out.println("Real and Imaginary:"+C.real+"+"+C.imaginary+"i");

}//main ends here

}//TestComplex Ends Here