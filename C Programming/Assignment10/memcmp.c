//memcmp();
//SYNTAX:int memcmp(const void *ptr1, const void *ptr2, size_t n);

#include<stdio.h>
#include<string.h>
int main(){
	char str1[]="Hello";
	char str2[]="World";
	
	int res = memcmp(str1,str2,3);
	printf("result:%d",res);
	
}