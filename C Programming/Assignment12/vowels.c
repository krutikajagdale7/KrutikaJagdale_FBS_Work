#include<stdio.h>
#include<string.h>
int CountVowels(char*, int);
void main(){
char str[20];
int c1;
printf("enter string :");
	scanf("%s",str);
   int res= CountVowels(str,c1);
    printf("Vowels in string are:%d",res);
}
int CountVowels(char* s1 , int count)
{
	int i=0;
	count =0;
	 while(s1[i]!=0){
	 
	 if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'){
	 		count++;
		 }
		 i++;
	 }
	 return count;
	 
}