//strcspn();It counts the number of characters at the start of a string (str1) that are NOT in a second string (str2).
//As soon as it finds any character from str2, it stops counting.
//SYNTAX:size_t strcspn(const char *str1, const char *str2);

#include<stdio.h>
#include<string.h>
int main(){
char str1[]="KrutikaJagdale";//scan
char str2[]="ghfdsc";//the set of unwanted characters (stop scanning if found).
size_t i = strcspn(str1,str2);
printf("index of that string:%d",i);//k to g - g is found then stop
//K is not in harshada = count +1
//a it present in both then it will stop 
}