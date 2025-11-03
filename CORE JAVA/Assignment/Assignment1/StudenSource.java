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

}//Student ends here
class TesStudent{
public static void main(String[]args){
	Student s1;
	s1=new Student();
	s1.SetRollNO(10);
	s1.SetName("Krutika");
	s1.SetMarks(90);
System.out.println("RollNO:"+s1.RollNo+"\nName:"+s1.Name+"\nMarks"+s1.Marks);

}//mamain ends here
}//TestStudent Ends here