class Calculator{

void add(int a, int b){
System.out.println("fun1");
//int c = a + b;
System.out.println("addition is:"+(a+b));


}
void add(int a, float F ){
System.out.println("fun2");
//float c = a + F;
System.out.println("addition is:"+(a+F));
}
void add(float F, float E){
System.out.println("fun3");

//float c = F+E;
System.out.println("addition is:"+(F+E));

}
void add(double P, double R){
System.out.println("fun4");

//double c = P+R;
System.out.println("Substraction is:"+(P+R));

}
///Substraction
void sub(int a, int b){
System.out.println("fun1");
//int c = a + b;
System.out.println("Substraction is:"+(a-b));


}
void sub(int a, float F ){
System.out.println("fun2");
//float c = a + F;
System.out.println("Substraction is:"+(a-F));
}
void sub(float F, float E){
System.out.println("fun3");

//float c = F+E;
System.out.println("Substraction is:"+(F-E));

}
void sub(double P, double R){
System.out.println("fun4");

//double c = P+R;
System.out.println("Substraction is:"+(P-R));

}
////Multiplication

void multiplication(int a, int b){
System.out.println("fun1");
//int c = a + b;
System.out.println("multiplication is:"+(a*b));


}
void multiplication(int a, float F ){
System.out.println("fun2");
//float c = a + F;
System.out.println("multiplication is:"+(a*F));
}
void multiplication(float F, float E){
System.out.println("fun3");

//float c = F+E;
System.out.println("multiplication is:"+(F*E));

}
void multiplication(double P, double R){
System.out.println("fun4");

//double c = P+R;
System.out.println("multiplication is:"+(P*R));

}

///Division
void division(int a, int b){
System.out.println("fun1");
//int c = a + b;
System.out.println("division is:"+(a/b));


}
void division(int a, float F ){
System.out.println("fun2");
//float c = a + F;
System.out.println("division is:"+(a/F));
}
void division(float F, float E){
System.out.println("fun3");

//float c = F+E;
System.out.println("division is:"+(F/E));

}
void division(double P, double R){
System.out.println("fun4");

//double c = P+R;
System.out.println("division is:"+(P/R));

}



}// calculator ends here

class Test{

public static void main(String[] args){
 Calculator C1 = new Calculator();
 int a = 10;
 int b=20;
 //int D =22;
float F = 10.0f;
float E = 20.0f ;
double P=10.0;
double R=20.0;
 C1.add(a,b);
 C1.add(a,F);
 C1.add(F,E);
 C1.add(P,R);
	
 C1.sub(a,b);
 C1.sub(a,F);
 C1.sub(F,E);
 C1.sub(P,R);

 C1.multiplication (a,b);
 C1.multiplication (a,F);
 C1.multiplication (F,E);
 C1.multiplication (P,R);

 C1.division(a,b);
 C1.division(a,F);
 C1.division(F,E);
 C1.division(P,R);

}//main end here


}//test end here