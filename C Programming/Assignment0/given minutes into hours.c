#include<stdio.h>
void main(){
	int totalmin = 135;
	int hr, min;
	hr = totalmin / 60;
	min = totalmin % 60;
	
	//totalmin = 30;
	printf("Convert Given Minutes Into Hours and Remaining Mintues: %d hr %d min ",hr,min);

}