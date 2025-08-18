// str copy in another string

#include<stdio.h>
#include<string.h>
int main(){
	char str[10];
	char str1[10];
	printf(" Enter string:");
	scanf("%s",str);
	strcpy(str1, str);
			printf("Copy String is:%s", str1);
			//show null - in output
//			for(int i=0;i<10;i++){
//					if(str1[i] == '\0'){
//		printf("null");
//	}
//			}

	

	
	
	
}