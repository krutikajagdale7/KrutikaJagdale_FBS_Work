#include<stdio.h>
void main(){
	int n =4, count=0;
	for(int i = 1; i<=n;i++){
		for(int j = 1;j<=i;j++){
			count++;
			printf("%d ", count);
		}
		printf("\n");
	}
}