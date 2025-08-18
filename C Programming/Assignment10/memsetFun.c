//memset();Fills a block of memory with a particular byte value.
//SYNTAX: void *memset(void *ptr, int value, size_t num);
//Parameters:ptr ? pointer to the starting memory block to fill.//value ? the byte you want to set (converted to unsigned char).//num ? number of bytes to fill.
#include<stdio.h>
#include<string.h>
int main(){
char str[10];
memset(str , '*', 5);
str[5]='\0';
printf("String after memset: %s",str);

}