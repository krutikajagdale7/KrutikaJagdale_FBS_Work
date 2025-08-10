#include<stdio.h>
char VowelsConsonant();
void main(){
	char res=VowelsConsonant();
	if(res==1){
		printf(" \n It is Vowels");
	}else{
		printf(" \n It is Consonant");
	}
}
char VowelsConsonant(){
	char ch = 'x';
	if(ch == 'A'|| ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
		return 1;
	}
	else{
		return 2;
	}
}//void VowelsConsonant() fun ends here

