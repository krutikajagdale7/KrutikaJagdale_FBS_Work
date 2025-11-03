class Book {

int ISBN;
String BookName;
String Category;
double Price;
void SetISBN(int I){
	this.ISBN = I;


}
void SetBName(String BN){
	this.BookName = BN;

}
void SetCategory(String C){
	this.Category = C;
}
void SetPrice(double P){
	this.Price=P;
}
int getISBN()
{
	return this.ISBN;
}
String getBName()
{
	return this.BookName;
}
String getCategory()
{
	return this.Category;
}
double getPrice()
{
	return this.Price;
}
void Display()
{
 System.out.println("ISBN is:"+this.ISBN+"\nBook Name is:"+this.BookName+"\nCategory is:"+this.Category+"\nPrice is:"+this.Price);
}

}//book ends here

class TestBook{
public static void main(String[]args){
	Book B1,B2;
	B1 = new Book();
	B2 = new Book();
	B1.SetISBN(2002);
	B1.SetBName("AtomicHabbit");
	B1.SetPrice(100);
	B1.SetCategory("PersnolDevelopment");

	B2.SetISBN(2001);
	B2.SetBName("Chatrapati");
	B2.SetPrice(150);
	B2.SetCategory("Historical");
	System.out.println("\nHere B1 Object Start ->");

	B1.getISBN();
	B1.getBName();
	B1.getPrice();
	B1.getCategory();
	B1.Display();

System.out.println("-------------------------------------");	
System.out.println("\nHere B2 Object Start ->");
	B2.getISBN();
	B2.getBName();
	B2.getPrice();
	B2.getCategory();
	B2.Display();
//System.out.println("ISBN:"+B1.ISBN+"\nBookName:"+B1.BookName+"\nPrice:"+B1.Price+"\nCategory:"+B1.Category);


}//main ends here
}//TestBook ends here