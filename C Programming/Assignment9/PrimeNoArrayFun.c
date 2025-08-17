#include<stdio.h>
void ScanArray(int*, int );
void PrimeNoFun(int*,int);
void main(){
	int flag=0;
	int arr[5];
	printf("enter no:");
	ScanArray(arr,5);	
printf("Prime Number in Araay are:");
    PrimeNoFun(arr,5);
    
	
}
void ScanArray(int* ptr, int size){
	for(int i=0;i<size;i++){
		scanf("%d", &ptr[i]);
}
}
void PrimeNoFun(int* ptr, int size){
	for(int i=1; i<size;i++){
		int flag =1;
		if(ptr[i]<2){
			flag=0;
		}else{
			for(int j=2;j*j<=ptr[i];j++){
 				if(ptr[i]%j==0){
					flag =0;
					break;
	}
		}
}
if(flag==1){
	printf(" [%d]",ptr[i]);
}
}
}
