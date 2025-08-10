#include<stdio.h>
int PrintGreatestNo();
void main(){
	int res = PrintGreatestNo();
	if(res==1){
		printf("a is greater");
	}else if(res==2){
		printf("a is greater");
	}else if(res==3){
		printf("b is greater");
	}
	else{
		printf("c is greater");
	}
}
int PrintGreatestNo(){
#include<stdio.h>
void main(){
	int a = 0, b = 10, c = 30;
	if(a>b){
		return 1;
	}
	else if(a>c){
			return 2;
		}
		else if(b>c){
				return 3;
		}
			else{
			return 4;
		}
	}


}

