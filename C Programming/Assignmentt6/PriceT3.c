#include<stdio.h>
void Price(int, char);
void main(){
	int p;
	char ch1;
	printf("Enter Price:");
	scanf("%d", &p);
	printf("Enter Char:");
	scanf(" %c", &ch1);
	Price(p, ch1);
}
void Price(int price, char ch1){
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
		printf("%lf", total_price);
	}

