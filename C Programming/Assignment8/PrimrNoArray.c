#include<stdio.h>
void main(){
	int flag=0;
	int arr[5];
	printf("enter no:");
	for(int i=0;i<5;i++){
		scanf("%d", &arr[i]);
}
printf("Prime Number in Araay are:");
	for(int i=1; i<5;i++){
		flag =1;
		if(arr[i]<2){
			flag=0;
		}else{
			for(int j=2;j*j<=arr[i];j++){
 				if(arr[i]%j==0){
					flag =0;
					break;
	}
		}
}
if(flag==1){
	printf(" [%d]",arr[i]);
}
}
}
