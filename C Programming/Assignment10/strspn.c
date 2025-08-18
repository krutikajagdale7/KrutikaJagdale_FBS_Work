//strspn();SYNTAX:size_t strspn(const char *str1, const char *str2);

//find char in str1 which is present in str2 
//char is not found in str2the it will stop counting.


#include<stdio.h>
#include<string.h>
int main(){
char str1[]="Krutika";//scan str
//string containing all accepted characters
printf("Char Which count is:%zu",strspn(str1,"r"));


}