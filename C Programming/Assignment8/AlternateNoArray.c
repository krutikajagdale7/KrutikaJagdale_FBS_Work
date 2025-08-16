//print alternate element in array
#include<stdio.h>
void main(){
	int arr[6];
	printf("Enter num:");
		for(int i=0;i<6;i++){
		scanf("%d",&arr);
	}
	int n = sizeof(arr)/sizeof(arr[0]);
	for(int i= 0;i<6;i+=2){
	   printf("%d\n", arr[i]);
	}
	
}