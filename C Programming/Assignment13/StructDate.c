#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Date{
	int date;
	int month;
	int year;
};
void main(){
	struct Date D1, D2;
	D1.date = 07;
    D1.month = 11;
    D1.year = 2003;
	
	printf("# Date Details #\n");
		printf("\n Date First :\n");
	printf("\nDate: %d", D1.date);
	printf("\nMonth: %d", D1.month);
	printf("\nYear: %d\n", D1.year);
	
	printf("\nDetails Of Date2 :\n");
	
	printf("\nDate: ");
	scanf("%d", &D2.date);
	printf("\nMonth:");
	scanf("%d", &D2.month);
	printf("\nYear:");
	scanf("%d",&D2.year);
	
	printf("\n Second Date :\n");
    printf("\nDate: %d\nMOnth No: %f\nYear:%f", D2.date,D2.month,D2.year);
	
	
}
	

