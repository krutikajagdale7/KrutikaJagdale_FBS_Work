
class Shape {
String color;
double area;
double perimeter;

Shape(){
	System.out.println("Shape Default Constructor");
	this.color = "Red";
	this.area = 3.2;
	this.perimeter= 6.6;
	
}
Shape(String C, double A, double P){
	System.out.println("Shape Parameterized Constructor");
	this.color = C;
	this.area = A;
	this.perimeter = P;
	
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public double getPerimeter() {
	return perimeter;
}
public void setPerimeter(double perimeter) {
	this.perimeter = perimeter;
}
double calarea() {
	return area;
}

void Display() {
	
	System.out.println("Color is:"+this.color);
	System.out.println("Area is:"+this.area);
	System.out.println("Perimeter is:"+this.perimeter);
	
	
}
}//Shape end here
class Circle extends Shape{
	double Radius;
Circle(){
	super();
	System.out.println("Circle Default Constructor");
	this.color="Purple";
	this.area=2.5;
	this.perimeter = 5;
	this.Radius = 5.5;
}
Circle(String C, double A, double P, double R)
{	super(C,A,P);
	System.out.println("Circle Parameterized Constructor");
	this.color= C;
	this.area= A;
	this.perimeter = P;
	this.Radius = R;
}
public double getRadius() {
	return Radius;
}
public void setRadius(double radius) {
	Radius = radius;
}
double calarea() {
	return 3.14* Radius*Radius;
}
void Display()
{
	super.Display();
	System.out.println("Radius is:"+this.Radius);



}
}//Circle end here

class Triangle extends Shape{
	double Base;
	double Height;
	
	Triangle(){
		super();
		System.out.println("Triangle Default Constructor");
		this.color = "Blue";
		this.area = 9.0;
		this.perimeter = 2.4;
		this.Base = 5.6;
		this.Height = 5.3;
		
	}
	Triangle(String C, double A, double P, double B, double H){
		super(C,A,P);
		System.out.println("Triangle Parameterized Constructor");
		this.color = C;
		this.area = A;
		this.perimeter = P;
		this.Base =B;
		this.Height =H;
	}
	public double getBase() {
		return Base;
	}
	public void setBase(double base) {
		Base = base;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	double calarea() {
		return 0.5*Base*Height;
	}
	void Display()
	{
		super.Display();
		System.out.println("Base is:"+this.Base);
		System.out.println("Height is:"+this.Height);
		
		
	}
}//Triangle end here

class Rectangle extends Shape{
	double length;
	double width;
	
	Rectangle()
	{
		super();
		System.out.println("Rectangle DefaultConstructor");
		this.color = "Yellow";
		this.area = 1.2;
		this.perimeter = 5;
		this.length = 8.8;
		this.width = 9.9;
	}
	Rectangle(String C, double A, double P, double L, double W){
		super(C,A,P);
		System.out.println("Rectangle Parameterized Constructor");
		this.color = C;
		this.area = A;
		this.perimeter = P;
		this.length = L;
		this.width = W;
		
	
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	double calarea() {
		return length*width;
	}
	void Display()
	{
		super.Display();
		System.out.println("length is:"+this.length);
		System.out.println("width is:"+this.width);
		
		
	}
	
	
}//rectangle end here

class Test1{
	public static void main(String [] args) {
		Shape S1 = new Shape("black",5.0,3.0);
		System.out.println(S1.calarea());
		S1 = new Circle("white",9.0,4.0,7.9);
		System.out.println(S1.calarea());

		S1 = new Triangle("Green",5,4,4.4,3.3);
		System.out.println(S1.calarea());

		S1 = new Rectangle("Pink",1,3,5.6,7.8);
		System.out.println(S1.calarea());

		
//		Shape S1 = new Shape();
//		S1.Display();
//		Shape S2 = new Shape("black",5.0,3.0);
//		S2.Display();
//		
//		Circle c1 = new Circle();
//		c1.Display();
//		Circle c2 = new Circle("white",9.0,4.0,7.9);
//		c2.Display();
//		
//	    Triangle  t1 = new Triangle();
//		t1.Display();
//		Triangle t2 = new Triangle("Green",5,4,4.4,3.3);
//		t2.Display();
//		
//		Rectangle r1 = new Rectangle();
//		r1.Display();
//		Rectangle r2 = new Rectangle("Pink",1,3,5.6,7.8);
//		r2.Display();
		
		
	}//main end here
	
	
}//test end here
