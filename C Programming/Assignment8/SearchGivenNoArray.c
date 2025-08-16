//searchgiven no in an array
#include<stdio.h>
void main(){
	int arr[5], num;
	
	printf("Enter Number In array:");
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	
	printf("enter no for check:");
	scanf("%d", &num);
	
	for(int i=0;i<5;i++){
		if(arr[i]==num){
			printf("No. is Found at position %d", i);//i+1
		 
		
		}
	
	}
	
		printf("No not found: \n");
	    
}