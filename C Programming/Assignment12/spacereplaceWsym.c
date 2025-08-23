#include<stdio.h>
#include<string.h>
char* replace(char* , char , char );
int main(){

char str[20]="krutika jagdale";
char space = ' ';
char symbol = '$';
printf("original is: %s\n",str);
replace(str, space, symbol);
printf("string is: %s",str);


}
char* replace(char* s1, char sp,char s){
	int i=0;
	while(s1[i]!=0){
	
	if(s1[i]==' '){
		s1[i]= s;
		
	}
	i++;
	
	
}

	
}