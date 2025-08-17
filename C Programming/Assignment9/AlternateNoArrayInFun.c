#include<stdio.h>
void ScanArray(int* , int );
void AlternateNo(int* , int );
void main(){
int arr[5];

printf(" Enter No for array:");
   ScanArray(arr, 5);
printf("Alternate Array:");
   AlternateNo(arr, 5);
}

void ScanArray(int* ptr, int size){
	for(int i=0;i<size;i++){
		scanf("%d", &ptr[i]);
	}

}

void AlternateNo(int* ptr1, int size1){
	for(int i=0;i<size1;i=i+2){
	printf(" %d",ptr1[i]);
}
}