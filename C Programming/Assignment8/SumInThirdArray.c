#include<stdio.h>
void main(){
	int arr[5];
	int brr[5];
	int crr[5];
	//int sum =0;
	printf("Enter No for Array 1: ");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
		
	}
	printf(" Enter No for Array 2: ");
	
	for(int i=0;i<5;i++){
		scanf("%d", &brr[i]);
	}
	
	for(int i=0;i<5;i++){
		
		crr[i]= arr[i]+brr[i];
	}
	
	printf("Sum in Third Array:");
	for(int i=0 ;i<5;i++){
		printf(" [%d]", crr[i]);
	}
	
	
			
}