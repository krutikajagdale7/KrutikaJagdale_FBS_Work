#include<stdio.h>
int main(){
	int n = 12345;
	int fd = n;
	int ld = n%10;
	
	while(fd >= 10){
		fd = fd/10;
		
	}
	int sum = fd+ld;
	printf("sum of fd and lf id %d", sum);
}