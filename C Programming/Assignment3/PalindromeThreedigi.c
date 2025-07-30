#include<stdio.h>
int main(){
	int no = 122;
	int rev, r1 , r2, r3;
	int q1;
	r1 = no%10;
	q1 = no/10;
	r2 = q1%10;
	r3 = q1/10;
	rev = r1*100+r2*10+r3;
	if(no==rev){
		printf("NO is Palindrome");
	}
	else{
		printf("NO is NOT Palindrome");
	}
}