//strchr();-- SYNTAX: char *strchr(const char *str, int c);//Searches for the first occurrence of a character in a string. Returns a pointer to where it found the character, or NULL if not found.

#include<stdio.h>
#include<string.h>
int main(){
	
	char str[]="krutika";
	char *ptr = strchr(str,'k');//scan from 1st like k-r-u...
	printf("First ocurrence of r : %s\n", ptr);
}