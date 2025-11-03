class Distance{
 int KM;
 int M;
void SetKM(int km){
  this.KM = km;
}
void SetM(int m){
	this.M=m;
}

}//Distance ends here

class TestDistance
{	 public static void main(String[]args){
	Distance D1;
	D1 =new Distance();
	D1.SetKM(100);
	D1.SetM(50);
System.out.println("KM:"+D1.KM+"\nM:"+D1.M);
}//main ends here 

}//TestDistance Ends here