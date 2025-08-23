#include<stdio.h>
#include<string.h>
NOofWords(char* , char , int );
void main(){
	
char str[7];
char ch;
int count;
printf("Enter string:");
scanf("%s",str);
int words = NOofWords(str,ch,count);
printf("Count of words is: %d",words);
}
int NOofWords(char* s1, char ch1, int count1){
	count1 =0;
	int i=0;
	while(s1[i]!='\0'){
	if(s1[i]!= ' '&&(i==0||s1[i-1]==' ')){
		count1++;	
	
	}
	i++;
	
}
return count1;
}