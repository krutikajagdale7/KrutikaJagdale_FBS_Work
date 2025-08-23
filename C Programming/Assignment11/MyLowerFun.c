#include<stdio.h>
#include<string.h>
char* MyLowerCase(char*);
void main(){
char str1[10]="KRUTIKA";

char* ch=MyLowerCase(str1);
printf("String is in Uppercase:%s",str1);

}
char* MyLowerCase(char* s1){
	int i=0;
	while(s1[i]!='\0'){
		if(s1[i]>='A'&& s1[i]<='Z'){
		s1[i] = s1[i]+32;
		}
		i++;
	}
	return s1;
}