#include<stdio.h>
int main(){
	int n = 153;
	int original, reminder, sum = 0;
	original = n;
	while(n != 0){
		reminder = n %10;
		sum = sum+(reminder *reminder*reminder);
		n = n/10;
	}
	if(sum == original){
		printf("No is Armstrong");
	}
	else{
		printf("No is NOT Armstrong");
	}
}