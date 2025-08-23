#include<stdio.h>
#include<string.h>
char* mystrncpy(char* , char* , int);
int main(){
	char src[]="Hello";
	char dest[10];
	char * ch = mystrncpy(dest,src,3);
	printf("copied string : %s",dest);
	
}
char* mystrncpy(char* d, char* s, int n){
		int i=0;
		//while(i<n && s[i]!='\0'){
		
			//i++;
		
		while(i<n){
				d[i]=s[i];
			i++;
		}
	    
	 	return d;		
	}
