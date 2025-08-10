#include<stdio.h>
int evenodd();

int main(){
	int res = evenodd();
	if(res==1){
			printf(" Number is Even");
	}else{
		printf(" Number is Odd");
	}
	
}

int evenodd(){
	int no = 8;
	return (no%2==0);
	
}//even odd fun end here

