#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Complex{
	double real;
	double img;
};
void main(){
	struct Complex C1,C2;
	C1.real =30.800;
	C1.img = 98.99;
	
	printf("# Complex No  #\n");
	
	printf("\n First Complex NO:\n");
	printf("\nReal NO: %lf", C1.real);
	printf("\nImaginary No: %lf",C1.img);
	
	printf("\nEnter Complex NO  :\n");
    printf("Real NO:");
    scanf("%lf",&C1.real);
    printf("Imaginary No:");
    scanf("%lf",&C1.img);
    printf("\n Second Complex NO:\n");
	
	printf("\nReal NO: %lf\nImaginary No: %lf", C1.real,  C1.img);
	
	
 
}
	