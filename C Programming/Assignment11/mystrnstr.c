#include<stdio.h>
#include<string.h>
char* mystrnstr(char* ,char* , int );
void main(){
int n;
char str1[10]="Jagdale";

char str2[20]="Krutika";

char* res = mystrnstr(str1, str2, 3); // only first 12 chars
    if (res)
        printf("Found: %s\n", res);
    else
        printf("Not found in first n chars\n");

}
char* mystrnstr(char* s1,char* s2, int n1){

int i=0,j=0;
int len_s2 = strlen(s2);

while(s1[i]!='\0'&& i<n1){
	if(s1[i]==s2[j]){
		j++;
		if(j==len_s2){
			return (char*)(s1+i-len_s2+1);
		}
		else{
			if(s1[i]==s2[0]){
				j=1;
				
			}else{
				j=0;
			}
		}
	}
	i++;
}


}