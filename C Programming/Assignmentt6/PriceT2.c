#include<stdio.h>
int Print_Price();
void main(){
	int price = 500;
	int discount = 0;
	
	int res = Print_Price();
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
int Print_Price(){
	int price;
	double total_price;
	char ch = 's';// s = stud
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

