#include<stdio.h>
#include<string.h>
int main(){
	char str1[]="krutika";
	char str2[]="Krutika";
	mystrcasecmp(str1,str2);
	if(res==0){
		printf("Equal:%s",res);
	}
	else if(res<0){
		printf(" str1 is less than str2");
	}else{
			printf(" str1 is grater than str2");
	}
}
char tolower(char c){
	if(c >='A'&&c <='Z'){
		return c +32;
	}
	return c;
}
mystrcasecmp(char* s1. char* s2){
	int i=0;
	
	while(s1[i]!='\0'&& s2[i]!='\0'){
	char c1	= tolower(s1[i]);
	char c2 =tolower(s2[i]);
	}
	if(c1!=c2){
		
	}
}