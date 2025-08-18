//Converts a single lowercase letter to its uppercase equivalent.
//If the character is already uppercase, not alphabetic, or outside the unsigned char range, it is returned unchanged.
//SYNTAX:int toupper(int ch);


#include<stdio.h>
#include<string.h>
int main(){
char ch ='k';
char upper = toupper(ch);
printf("Uppercase char:%c",upper);
}