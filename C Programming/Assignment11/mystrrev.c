#include<stdio.h>
#include<string.h>
char* mystrrev(char* );
int main(){
char str[]="krutika";
char* ch =mystrrev(str);
 printf("Reverse String is : %s", ch);

}
char* mystrrev(char* s ){
	int start=0;
	int end=0;
	int temp;
	
	while(s[end]!='\0'){
		end++;
	}
	end--;
	
	while(start<end){
		temp=s[start];
		s[start]=s[end];
		s[end]=temp;
		start++;
		end--;
	}
	return s;
}
