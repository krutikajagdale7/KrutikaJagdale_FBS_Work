//sort array - logic Compare first no to all

#include<stdio.h>
void main(){
	int arr[5];
	printf("Enter No in array:");
	for(int i =0;i<5;i++){
		scanf("%d", &arr[i]);
	}
	printf("Sorting Array:");
	for(int i=0;i<5;i++){
		for(int j=i+1;j<5;j++){
			if(arr[i]>arr[j]){
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}	
		}
	}
	
	for(int i=0;i<5;i++){
		printf("[%d]",arr[i]);
	}
		
}