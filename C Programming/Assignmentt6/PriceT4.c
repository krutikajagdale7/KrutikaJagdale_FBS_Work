#include<stdio.h>
double Price(double, char);
void main(){
	double price;
	char ch;
	printf("Enter Price:");
	scanf("%lf", &price);
	printf("Enter Char:");
	scanf(" %c", &ch);
	Price(price, ch);
}
double Price(double price, char ch1){
	//int price = 500, 
	int discount = 0;
	//char ch = 's';// s = stud
	if(ch1 == 's'){
		if(price > 500){
			discount = price*0.20;
			
		}else{
			discount = price*0.10;
			
		}
	}
		else if (price > 600){
			discount = price*0.15;
		
		}else{
		
			discount = price*0.0;
		}
		double total_price= price - discount;
		printf("Total_Price: %lf", total_price);
	}

