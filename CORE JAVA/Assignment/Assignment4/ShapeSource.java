class Shape{

void Area(double B, double H)
{
double area = 0.5*B*H;
System.out.println("Area Of triangle is:"+area);

}
void  Area(int L, int b)
{
double area = L*b;
System.out.println("Area Of Rectangle is:"+area);
}
void Area(float R)
{
float area = 3.14f*R*R;
System.out.println("Area Of Circle is:"+area);
}

}//Shape end here
class TestShape{

public static void main(String [] args){
double B = 2.4 ;
double H = 3.4;
int L =3;
int b = 2;
float R = 4.5f;
Shape s = new Shape();
s.Area(B,H);
s.Area(L,b);
s.Area(R);

}//main end here



}//TestShape end here
