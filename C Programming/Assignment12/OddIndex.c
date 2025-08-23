#include<stdio.h>
#include<string.h>
void OddIndex(char* );
void main(){
	//int index;
char str[10];
printf("Enter string:");
scanf("%s",str);

OddIndex(str);
printf("String with remove odd char :%s",str);
}
void OddIndex(char* s1){
	int j=0;
	int i=0;
	while(s1[i]!='\0'){
		if(i%2==0){
			s1[j++]=s1[i];
		}
		
		i++;
	}
	s1[j]='\0';
	
	
	
}