#include<stdio.h>
#include<string.h>
void searchchar(char* ,int );
void main(){
	
	char str[20];
	int index;
	printf("enter string :");
	scanf("%s",str);
	char ch;
	printf("Enter a index:");
	scanf("%d",&index);
	searchchar(str,index);
	
}
void searchchar(char* s,int p){
	
	int i=0;
	if(p>=0 && p<strlen(s))
	{
		printf("character:%c ",s[i]);

	}else{
		printf("char not found");
	}
	

}