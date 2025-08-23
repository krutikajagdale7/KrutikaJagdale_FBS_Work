#include<stdio.h>
#include<string.h>
int mystrcmp(char*,char* );
int main(){
char str1[]="krutika";
char str2[]="krutika";
int res=mystrcmp(str1,str2);
   printf("%d",res);
}

int mystrcmp(char* s1, char*s2){
	int i=0;
	while(s1[i]!='\0'||s2[i]!='\0'){
		if(s1[i]!=s2[i]){
			if(s1[i]>s2[i]){
			
			if(s1[i]<s2[i]){
				return 1;
			}else{
				return-1;
			}
		}
		
	}
	i++;
	return 0;
	
}
}
