#include<stdio.h>
void main(){
	int hr = 2, min = 37, sec =10;
	int total_sec = (hr*3600)+(min*60)+sec;
	printf("Total Seconds id : %d", total_sec);
}