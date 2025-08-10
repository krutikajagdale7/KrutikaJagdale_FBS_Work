#include<stdio.h>
int pallindrome();
int main()
{
	int res = pallindrome();
if (res==1)	{
		printf(" \n NO is Palindrome");
	}
	else{
		printf("\n NO is NOT Palindrome");
	}
}
int pallindrome(){

int no = 121;
	int rev, r1 , r2, r3;
	int q1;
	r1 = no%10;
	q1 = no/10;
	r2 = q1%10;
	r3 = q1/10;
	rev = r1*100+r2*10+r3;
	return (no==rev);
}//pallindrome fun ends here