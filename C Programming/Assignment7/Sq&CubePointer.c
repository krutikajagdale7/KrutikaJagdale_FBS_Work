#include<stdio.h>
int PrintSquare(int* );
int PrintCube(int* );
void main(){
	int a;
	printf("enter num:");
	scanf("%d", &a);
    PrintSquare(&a);
    PrintCube(&a);

}
int PrintSquare(int* a){
	 int square = *a *  *a;
	printf("square of no is:%d",square);
}
int PrintCube(int*  c){
	 int cube = *c * *c * *c;
	printf("\nCube of no is:%d",cube);
}