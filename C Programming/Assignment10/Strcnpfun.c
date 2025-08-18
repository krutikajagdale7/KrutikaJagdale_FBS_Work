//strcmp(); compare two string in dictionary order. syntax:int strcmp(const char *str1, const char *str2);
//0 if strings are equal

//< 0 if str1 is less than str2

//> 0 if str1 is greater than str2
#include<stdio.h>
#include<string.h>
int main(){
char src[]="World",dest[]="Hello";//here w=87, h=72 - w<h
char str1[]="Krutika", str2[]="Krutika";//k=k

//strcmp(dest, src);
printf("Compare String:%d\n",strcmp(dest,src));
printf("Compare String:%d",strcmp(str2,str1));

}