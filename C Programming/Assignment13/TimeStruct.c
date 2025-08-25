#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Time{
	int hour;
	float min;
	float sec;
};
void main(){
	struct Time T1, T2;
	T1.hour = 2;
    T1.min = 23.00;
    T1.sec = 20.00;
	
	printf("# Time Details #\n");
	printf("\n First Time :\n");
	printf("\nhour: %d", T1.hour);
	printf("\nMin: %f",T1.min);
	printf("\nsec: %f\n", T1.sec);
	
	printf("Details Of Time2 :\n");
    printf("Hour:");
    scanf("%d",&T2.hour);
    printf("min:");
    scanf("%f",&T2.min);
    printf("sec:");
    scanf("%f",&T2.sec);
    
    printf("\n Second Time :\n");
    printf("\nHour: %d\nMin No: %f\nSec:%f", T2.hour,T2.min,T2.sec);
 
}
	