#include<stdio.h>
char* mystrchr(char* , char );
#include<string.h>
void main(){
	char str[10];
	char ch;
	printf("enter string:");
	scanf("%s",str);
	printf("enter char:");
	scanf("%s",&ch);
char* p=	mystrchr(str,ch);
printf("stri:%s",str);
}
char* mystrchr(char* s1, char ch1){
	int i=0;
	while(s1[i]!='\0'){
		if(s1[i]==ch1){
			return s1;
		}
		i++;
	}
	if(ch1=='\0'){
		return s1[i];
		
	}
	return  NULL;
}