//searchgiven no in an array
#include<stdio.h>
void ScanArray(int* , int );
void SearchNoFun(int*,int,int);
void main(){
	int arr[5], num;
	

	printf("Enter Number In array:");
	ScanArray(arr, 5);
	
	printf("enter no for check:");
	scanf("%d", &num);
    SearchNoFun(arr, 5, num);
	    
}

void ScanArray(int* ptr, int size){
	for(int i=0;i<size;i++){
		scanf("%d",&ptr[i]);
	}
}
void SearchNoFun(int* ptr, int size, int num){
	int found =0;
	for(int i=0;i<size;i++){
		if(ptr[i]==num){
			printf("No. is Found at position %d", i);//i+1
		    found =1;
		    break;
		
		}
	    
			
			
	}
	
	if(!found){
			printf("No not found: \n");
	
	}
	
	
	


}