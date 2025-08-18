//strstr();[use for SubString fine] it’s a very useful function for searching substrings 
//SYNTAX:char *strstr(const char *haystack, const char *needle);


#include<stdio.h>
#include<string.h>
int main(){
char str[]="KrutikaJagdale";
char *ptr = strstr(str,"r");
printf("Substring Found:%s",ptr);

}