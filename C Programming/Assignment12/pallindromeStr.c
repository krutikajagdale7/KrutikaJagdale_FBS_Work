#include<stdio.h>
#include<string.h>
int PallindromeStr(char*);
void main(){
	//int index;
char str[10];
printf("Enter string:");
scanf("%s",str);
char res=PallindromeStr(str);
if(res==1){
	printf("String is Pallindrome ");
}else {
		printf("String is Not Pallindrome");
}
}
int PallindromeStr(char* s1){
	int start =0;
	int end = strlen(s1)-1;;
	int i=0;
	while(start<end){
		if(s1[start]!=s1[end]){
			return 0;
			
		}
		start++;
		end++;
		return 1;
		
	}
	
}