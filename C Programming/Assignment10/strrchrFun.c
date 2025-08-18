//Searches for the last occurrence of a character in a string (from the end backward).SYNTAX:char *strrchr(const char *str, int c);

#include<stdio.h>
#include<string.h>
int main(){
char str[]="krutika";//scan form last a-k
char *ptr = strrchr(str, 'k');
printf("Last Ocurrence Of k: %s",ptr);//ptr points to index 5 ? the substring "ka".Printing with %s outputs everything from that pointer until the null terminator (\0).

}