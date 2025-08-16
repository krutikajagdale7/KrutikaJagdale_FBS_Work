#include<stdio.h>
void main(){
	int arr[5];
	
	printf("Enter Number :");
	//scanf("%d",&n);
	for(int i=0;i<5;i++){
		scanf("%d",&arr[i]);
	}
	
	int min = arr[0];
	int max = arr[0];
	
	for(int j=0;j<5;j++){
		printf("%d\n ", arr[j]);
	
	
	if(arr[j]<min){
		min = arr[j];
	}
	if(arr[j]> max){
		max = arr[j];
	}
		
}
	printf("\n min no.:%d", min);
	printf("\n max no.:%d", max);

	
	
	
	
	
}