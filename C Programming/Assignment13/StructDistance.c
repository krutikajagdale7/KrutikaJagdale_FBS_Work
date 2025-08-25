#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Distance{
	int fit;
	int inch;

};
void main(){
	struct Distance D1, D2;
	D1.fit=10;
	D1.inch =5;
	
	printf("# Distance Details #\n");
	
	printf("\n First Distance :\n");
	printf("\nFit: %d", D1.fit);
	printf("\nInch: %d",D1.inch);
	
	printf("\nDetails Of Distance2 :\n");
    printf("Fit:");
    scanf("%d",&D1.fit);
    printf("Inch:");
    scanf("%d",&D1.inch);
    
    printf("\n Second Distance :\n");
    	printf("\nFit: %d\nInch No: %d", D1.fit,  D1.inch);
    
}
	