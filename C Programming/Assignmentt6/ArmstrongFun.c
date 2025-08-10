#include<stdio.h>
int Armstrong();
void main(){
	int res =Armstrong();
	if(res==1){
		printf(" No is Armstrong Number");
	}else
	{
		printf(" No is NOT  Armstrong Number");
	}
}



int Armstrong(){ //def
	int n = 153, rem, sum=0, temp;
	temp=n;
	while(temp!=0){
		rem = temp%10;
		sum = sum+rem*rem*rem;
		temp = temp/10;
	}	
	
	if(sum==n){
		return 1;
	}else
	{
		return 2;
	}
}//armstrong fun is ends here