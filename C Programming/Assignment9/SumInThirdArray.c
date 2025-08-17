#include<stdio.h>
void storearray(int* , int );
void Sum(int* , int , int*, int );
void main(){
	int arr1[5];
	int arr2[5];
	printf("Enter No for Array 1: ");
	storearray(arr1,5);
	printf("Enter No for Array 2: ");
	storearray(arr2,5);
	printf("Sum of array:");
	Sum(arr1, 5,arr2,5);
	
	
			
}
void storearray(int* ptr, int a){
	
	for(int i=0;i<a;i++){
		scanf("%d",&ptr[i]);
		
	}
	
}
void Sum(int* ptr, int a, int* ptr1, int a1 ){
	int crr[5];
	for(int i=0;i<a;i++){
		crr[i]=ptr[i]+ptr1[i];
		
		printf("%d ", crr[i]);
		
	}
	
}














