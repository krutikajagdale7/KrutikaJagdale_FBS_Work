#include<stdio.h>
// fun declaration
void evenodd();
void sumofdigit();
void leapYear();
void pallindrome();
void perfectNo();
void CountTotalSalary();
void UpperORLowerChar();
void VotingCriteria();
void VowelsConsonant();
void main(){
	// fun call here
	evenodd();
	sumofdigit();
	leapYear();
	pallindrome();
	perfectNo();
	CountTotalSalary();
	UpperORLowerChar();
	VotingCriteria();
	VowelsConsonant();
	
}//main is ends here
void evenodd(){
	int no = 8;
	if(no%2==0){
		printf(" Number is Even");
	}
	else
	{
		printf(" Number is Odd");
	}
}//even odd fun end here

void sumofdigit(){
	int n = 12345;
	int fd = n;
	int ld = n%10;
	
	while(fd >= 10){
		fd = fd/10;
		
	}
	int sum = fd+ld;
	printf("\n Sum of Firstdigit and Lastdigit = %d ", sum);
}//sumofdigit fun ends here

void leapYear(){
	int year = 2000;
	if((year % 4==0 && year % 100 !=0|| year %400 == 0 )){
		printf(" \n This year is Leap Year");
	}
	else{
		printf(" \n This year is NOT Leap Year");
	}
}//leapyear fun ends here

void pallindrome(){ //pallindrome fun start here
	int no = 122;
	int rev, r1 , r2, r3;
	int q1;
	r1 = no%10;
	q1 = no/10;
	r2 = q1%10;
	r3 = q1/10;
	rev = r1*100+r2*10+r3;
	if(no==rev){
		printf(" \n NO is Palindrome");
	}
	else{
		printf("\n NO is NOT Palindrome");
	}
}//pallindrome fun ends here

void perfectNo(){
	int num = 28;
	int i = 1;
	int sum = 0;
	while(i< num){
		if(num%i==0){
			sum = sum+i;
		}
		i++;
		
	}
	if(sum == num){
		printf(" \n No is Perfect", num);
	}
	else{
		printf("\n No is NOT Perfect", num);
	}
}//perfect fun ends here

void CountTotalSalary(){
	double basic_salary = 8000;
	double da, ta, hra, total_salary;
	if(basic_salary<=5000){
		da = basic_salary*0.10;
		ta = basic_salary*0.15;
		hra =basic_salary*0.20;
	}
	else{
		da = basic_salary*0.15;
		ta = basic_salary*0.25;
		hra = basic_salary*0.30;
	}
	total_salary =basic_salary+da+ta+hra;
	printf("\n Total_Salary: %lf",total_salary );
}//CountTotalSalary() fun ends here

void UpperORLowerChar(){
		char ch = 'c';
	if(ch >= 'A' && ch <='Z'){
		printf("\n Letter is in uppercase");
	}
	else{
		printf(" \n Letter is in Lowercase");
	}
}// UpperORLowerChar() ends here
void VotingCriteria(){
	int age = 10;
	if(age>=18){
		printf("\n Eligible for Voting");
		
	}
	else{
		printf(" \n NOT Eligible for Voting");
	}
}//VotingCriteria() fun ends here

void VowelsConsonant(){
	char ch = 'x';
	if(ch == 'A'|| ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
		printf(" \n It is Vowels");
	}
	else{
		printf(" \n It is Consonant");
	}
}//void VowelsConsonant() fun ends here

