//It concatenates (appends) one C string to the end of another. strcat()//syntax: char *strcat(char *dest, const char *src);
#include<stdio.h>
#include<string.h>
int main(){
	char str1[]="Krutika";
	char str2[]="Jagdale";
	
	strcat(str2,str1);
	printf("Concatination With 1st and 2nd string are: %s %s",str2);
}