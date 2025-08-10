#include<stdio.h>
void Operations(int,int,char);
void main(){
	int n1, n2;
	char ch1;
	printf("Enter n1 , n2:");
	scanf("%d %d", &n1, &n2);
	printf("enter char (+, -, *, /, %%): ");
	scanf(" %c", &ch1);//Fix: space before %c to consume newline
	Operations(n1, n2, ch1);
	
	
}
void Operations(int a,int b, char ch){
	
	//char ch ='-';
	if(ch =='+'){
		printf("addition of a and b is %d ", a+b);
	}
	else if(ch== '-'){
		printf("sub of a and b is %d ",a-b);
	}
	else if(ch == '*'){
		printf("mul of a and b is  %d", a*b);
	}
	else if(ch == '/'){
		printf("div of and b is %d", a/b);
	}
	else if (ch == '%'){
		printf("mod of a and b");
	}
	else {
        printf("Invalid operator entered.\n");
    }
}