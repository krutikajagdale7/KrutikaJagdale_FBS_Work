class Student{
	int RollNo;
	String Name;
	int Marks;
void SetRollNO(int RN){
 	this.RollNo = RN;
}
void SetName(String N){
	this.Name=N;
}
void SetMarks(int M){
	this.Marks = M;
}
int getRollNo()
{
	return this.RollNo;
}
String getName()
{
	return this.Name;
}
int getMarks()
{
	return this.Marks;
}

void Display()
{
	System.out.println("Rollno is:"+this.RollNo+"\nName is :"+this.Name+"\nMarks is:"+this.Marks);
	
}
}//Student ends here
class TesStudent{
public static void main(String[]args){
	Student s1, s2;
	s1=new Student();
	s2 = new Student();
	s1.SetRollNO(10);
	s1.SetName("Krutika");
	s1.SetMarks(90);

	
	s2.SetRollNO(11);
	s2.SetName("Harshada");
	s2.SetMarks(80);
	System.out.println("\nHere s1 Object Start ->");

	s1.getRollNo();
	s1.getName();
	s1.getMarks();
	s1.Display();
	System.out.println("-------------------------------------");
	System.out.println("\nHere s2 Object Start ->");
	s2.getRollNo();
	s2.getName();
	s2.getMarks();
	s2.Display();


//System.out.println("RollNO:"+s1.RollNo+"\nName:"+s1.Name+"\nMarks"+s1.Marks);

}//main ends here
}//TestStudent Ends here