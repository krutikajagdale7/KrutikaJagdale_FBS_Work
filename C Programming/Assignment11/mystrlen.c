#include<stdio.h>
#include<string.h>
int mystrlen(char* );
int main(){
	char str[]="hello";
	char* res = mystrlen(str);
	printf("str len is:%d", res);
}
int mystrlen(char* ptr){
	int i=0;
	while(ptr[i]!='\0'){
		i++;
	}
	return i;
}