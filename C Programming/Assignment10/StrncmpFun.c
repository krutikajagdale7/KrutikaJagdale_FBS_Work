//strncmp();-Compares at most n characters of two strings, lexicographically., dectionary order. SYNTAX: int strncmp(const char *str1, const char *str2, size_t n);
//str1 ? first string (read only ? const).
//str2 ? second string (read only ? const).
//n ? maximum number of characters to compare.
#include<stdio.h>
#include<string.h>
int main(){
	
	char src[]="Krutika", dest[]="KrutikaC";//C will compare to \0 - null = 67-0=67
	printf("Comapre First 3 char: %d",strncmp(dest,src,3));
	
}