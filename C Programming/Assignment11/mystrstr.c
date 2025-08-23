#include<stdio.h>
#include<string.h>
char* mystrstr(char* , char* );
int main(){
	char str1[]="KrutikaJagdale";
	char str2[]="Jag";
char* result= mystrstr(str1,str2);
if (result != '\0')
        printf("Substring found at: %s\n", result);
    else
        printf("Substring not found.\n");

    return 0;
}
char* mystrstr(char* s1, char* s2)

{     
       int i=0;
      if(s2[i]=='\0'){
 	
 	   return s1;
 }

 
 while(s1[i]!='\0'){
 	int j=0;
 	
 	while(s1[i+j]!='\0' && s2[j]!='\0' && s1[i+j]==s2[j]){
 		j++;
	 }
	 if(s2[j]=='\0'){
 	return &s1[i];
 }
  i++;
 }
 

	return  '\0';
	

}