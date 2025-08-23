#include<stdio.h>
#include<string.h>
char* mystrncpy(char* , char* );
int main(){
	char src[]="Hello";
	char dest[100];
	char * ch = mystrncpy(dest,src);
	printf("copied string : %s",dest);
	
}
char* mystrncpy(char* d, char* s){
		int i=0;
		//while(i<n && s[i]!='\0'){
		
			//i++;
		
		while( s[i]!='\0'){
				d[i]=s[i];
			i++;
		}
	    
	 	return d;		
	}
