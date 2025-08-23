#include<stdio.h>
#include<string.h>

int main(){
int index;
char str1[20];
printf("Enter str :");
scanf("%s",str1);

changeFCLC(str1,index);
//printf(" FcLc:",str);


}
changeFCLC(char* s1, int d){
	int i=0;
	int len =strlen(s1);
	if(len>0){
		int temp = s1[0];
		s1[0]=s1[len-1];
		s1[len-1]=temp;
	}
	printf("string is:%s",s1);

	  
	}

