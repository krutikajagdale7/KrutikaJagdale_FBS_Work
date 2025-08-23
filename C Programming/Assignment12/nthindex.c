#include<stdio.h>
#include<string.h>
char* nthIndex(char* , int);
void main(){
	char str[20];
	int x;
	printf("enter str:");
	scanf("%s",str);
	printf("enter index:");
	scanf("%d",&x);
  char* ch=nthIndex(str, x);
  printf("String is : %s",ch);
}
char* nthIndex(char* s1, int x1)
{   int len = strlen(s1);

    if(x1>0||x1<=strlen(s1));
	{
	
	int i=x1;
	while(s1[i]!='\0'){
		s1[i]=s1[i+1];
		i++;
	}
}
	return s1;
	
}