#include<stdio.h>
double Print_Price(double);
void main(){
	//int price = 500;
	double price;
	char ch;
	int discount = 0;
	printf(" Enter Price:");
	scanf("%lf", &price);
	printf(" Enter Character:");
	scanf(" %c", &ch);
	
	double res = Print_Price(price);
	if (res==1){
		 discount = price*0.20;
	}else if(res==2){
		discount = price*0.10;
	}
	else if(res==3){
		discount = price*0.15;
	}else if(res==4){
		discount = price*0.0;
	}
		double total_price= price - discount;
		printf("Total_Price: %lf", total_price);
	
}
double Print_Price(double price){
	//int price;
	char ch = 's';	// s = stud
	double total_price;
    
	if(ch == 's'){
		if(price > 500){
			return 1;
			
		}else{
			return 2;
			
		}
	}
		else if (price > 600){
			return 3;
		
		}else{
		
			return 4;
		}
		
		return total_price;
	}

