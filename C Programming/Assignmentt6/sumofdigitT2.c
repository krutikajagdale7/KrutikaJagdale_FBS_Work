#include<stdio.h>
int sumofdigit();
void main(){
	int sum = sumofdigit();
	printf("\n Sum of Firstdigit and Lastdigit = %d ", sum);
}

int sumofdigit(){
	
		int n = 12345;
	int fd = n;
	int ld = n%10;
	
	while(fd >= 10){
		fd = fd/10;
		
	}
	int sum = fd+ld;
	return sum;
}//sumofdigit fun ends here