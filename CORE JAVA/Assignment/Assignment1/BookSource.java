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

}//book ends here

class TestBook{
public static void main(String[]args){
	Book B1;
	B1 = new Book();
	B1.SetISBN(2002);
	B1.SetBName("AtomicHabbit");
	B1.SetPrice(100);
	B1.SetCategory("PersnolDevelopment");
System.out.println("ISBN:"+B1.ISBN+"\nBookName:"+B1.BookName+"\nPrice:"+B1.Price+"\nCategory:"+B1.Category);


}//main ends here
}//TestBook ends here