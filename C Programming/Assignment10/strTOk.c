//strtok();--Breaks a string into tokens (substrings) separated by any characters in a delimiter set.
//Replaces each delimiter with a '\0' (null character) so each token becomes a valid C string.
//Keeps track of its position internally for repeated calls.
//SYNTAX:char *strtok(char *str, const char *delim);

#include<stdio.h>
#include<string.h>
int main(){
char str[]="krutika,jagdale";
char *Token = strtok(str,",");
while(*Token!=NULL){
	printf("token: %s\n",Token);
	Token = strtok(NULL,",");
}

}