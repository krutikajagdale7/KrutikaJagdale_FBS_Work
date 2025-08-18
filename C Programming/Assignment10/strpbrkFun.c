//strpbrk();-strpbrk() searches for any character from a group of characters.
//SYNTAX: char *strpbrk(const char *str, const char *accept);- accept - string which is contain all char matching against.

#include<stdio.h>
#include<string.h>
int main(){
char str[]="KrutikaJagdale";
char *ptr = strpbrk(str,"aekfr");
//printf("Char From GrpOFChar is: %s",ptr);
printf("Char From GrpOFChar is: %c",*ptr);


}