#include<stdio.h>
#include<string.h>
char* nthIndex(char* , char);
void main(){
	char str[20];
	char ch;
	printf("enter str:");
	scanf("%s",str);
	printf("enter char:");
	scanf("%s",&ch);
char c=	nthIndex( str, ch);
printf("String is : %s",c);
}
char* nthIndex(char* s1, char ch1)
{
	int i=0;
	while(s1[i]!='\0'){
		if(s1[i]==ch1){
			s1[i]=s1[i+1];
		}
		i++;
		
	}
	return s1[i];
}