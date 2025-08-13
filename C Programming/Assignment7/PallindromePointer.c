#include<stdio.h>
void PrintPallindromeDigit(int*);
int main()
{
	int n;
	printf("Enter Num:");
	scanf("%d", &n);
	PrintPallindromeDigit(&n);
	   
}
void PrintPallindromeDigit(int*p){
	int rev = 0 , temp = *p;
	while(*p != 0 ){
		rev=rev * 10 + (*p % 10);
		*p= *p/10;
		
	}
	if(temp  == rev)
	    printf("num is palindrome ");
	else{
		printf("num is not palindrome ");
	} 
}