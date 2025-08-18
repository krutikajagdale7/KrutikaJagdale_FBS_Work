//memcpy();
//Copies a block of memory from one place to another.//Works byte by byte — it does not stop at '\0' like string functions do.//You must specify exactly how many bytes to copy.
//SYNTAX:void *memcpy(void *dest, const void *src, size_t n);

#include<stdio.h>
#include<string.h>
int main(){
char src[]="KrutikaJagdale";;
char dest[10];
memcpy(dest, src, strlen(src)+1);//+1 copy and \0 as well.
printf("Check in dest:%s",dest);

}