#include<stdio.h>
int PrintEvenOdd(int n);
int main(){
	int n;
	printf("Enter Number:");
	scanf("%d", &n);
	int res= PrintEvenOdd(n);
	if(res==1){
		printf(" Number is Even");
	}else{
		printf(" Number is Even");
	
	}
	
}
 int PrintEvenOdd(int n){
 	if(n%2==0){
 		return 1;
	 }else{
	 	return 0;
	 }

}