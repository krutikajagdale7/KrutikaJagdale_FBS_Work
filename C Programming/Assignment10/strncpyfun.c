//srtncpy-strncpy(destination, source, number_of_chars) // n no of char copy in another string.
#include<stdio.h>
#include<string.h>
int main(){
	char src[]="hello";
	char dest[10];
	strncpy(dest , src, 10);
	printf("Copy string id:%s", dest);
	
	
	
}