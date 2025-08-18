//SYNTAX:void *memmove(void *dest, const void *src, size_t n);
//Copies n bytes from src to dest, just like memcpy()//BUT it handles overlapping memory blocks safely by using a temporary buffer internally.

#include<stdio.h>
#include<string.h>
int main(){

char str1[]="Krutika";
char str2[10];
memmove(str2,str1,strlen(str1)+1);
printf(" Check in Destination:%s",str2);

}