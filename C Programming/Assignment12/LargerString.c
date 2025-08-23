#include<stdio.h>
#include<string.h>
int LargerString(char* , char* );
void main(){
	//int index;
char str1[10];
char str2[10];
printf("Enter string1:");
scanf("%s",str1);
printf("Enter string2:");
scanf("%s",str2);
char ch = LargerString(str1,str2);
if(ch==1){
	printf("Str1 is Larger than str2: %s",str1);
}else if(ch==-1){
	printf("Str2 is Larger than str1: %s",str2);
}else{
	printf("Str1 and str2 is equal:");
}


}
//void LargerString(char* s1, char* s2){
//	int len1 =strlen(s1);
//	int len2 =strlen(s2);
//	
//	if(len1>len2){
//		printf("Larger string is: %s",s1);
//	}else if(len2>len1){
//		printf("Larger String is: %s",s2);
//	}else{
//		printf("string is equal");
//	}
//	
//	
//}

int LargerString(char* s1, char* s2)
{    int i=0;
	while(s1[i]!='\0'||s2[i]!='\0'){
		if(s1[i]!=s2[i]){
			if(s1[i]>s2[i]){
				return 1;
			}else if(s1[i]<s2[i]){
				return -1;
			}else{
				return 0;
			}
		}
	}
}
