#include<stdio.h>
void main(){
	
	int arr1[5];
	int arr2[5];
	int arr3[10];
	
	printf("Enter no. for Array1:");
	for(int i=0;i<5;i++){
		scanf("%d",&arr1[i]);
	}
	printf("Enter no. for Array2:");
	for(int i=0;i<5;i++){
		scanf("%d",&arr2[i]);
	}
	
	for(int i=0;i<5;i++){
		arr3[i]=arr1[i];
	}
	
	for(int i=0;i<5;i++){
		arr3[i+5]=arr2[i];
	}
	
	printf("Merge Array is:");
	for(int i=0;i<10;i++){
		printf("[%d]",arr3[i]);
	}

	
	
	
	
}

