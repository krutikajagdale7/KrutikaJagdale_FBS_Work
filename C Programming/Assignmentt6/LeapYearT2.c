#include<stdio.h>
int leapYear();
int main()
{
	int res = leapYear();
	if(res==1){
		printf(" \n This year is Leap Year");
	}
	else{
		printf(" \n This year is NOT Leap Year");
	}
}

int leapYear(){
	int year = 2000;
	return ((year % 4==0 && year % 100 !=0|| year %400 == 0 ));
	
}//leapyear fun ends here