#include<stdio.h>
void Price();
void main(){
	Price();
}
void Price(){
	int price = 500, discount = 0;
	char ch = 's';// s = stud
	if(ch == 's'){
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

