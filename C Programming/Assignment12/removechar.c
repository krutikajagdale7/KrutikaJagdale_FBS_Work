#include<stdio.h>
#include<string.h>
void main(){
	
	char str1[9]="hello";

	int  i=4;
	while(str1[i]!='\0'){
		str1[i]=str1[i+1];
		i++;
	}
	
	printf("%s",str1);
}