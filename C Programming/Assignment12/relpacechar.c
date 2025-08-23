#include<stdio.h>
#include<string.h>
void replace(char* , char , char );
int main(){

char str[20]="krutika";
char ch ='a';
char symbol = '$';
printf("original is: %s\n",str);
replace(str, ch, symbol);
printf("string is: %s",str);


}
void replace(char* s1, char c,char s){
	int i=0;
	while(s1[i]!=0){
	
	if(s1[i]==c){
		s1[i]= s;
		
	}
	i++;
	
	
}

	
}