#include<stdio.h>
char UpperLowerChar();

int main(){
	char res = UpperLowerChar();
	if(res==1){
		printf("\n Letter is in Uppercase");
	}else{
		printf("\n Letter is in Lowercase");
	}
	
}
char UpperLowerChar(){
	
char ch = 'c';
	if(ch >= 'A' && ch <='Z'){
		return 1;
	}
	else{
	    return 2;
	}
}// UpperORLowerChar() ends here
