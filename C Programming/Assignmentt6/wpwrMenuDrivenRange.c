#include<stdio.h>
void MenuDriven();
void main(){
	MenuDriven();
}
void MenuDriven(){
	int n;
	printf("Enter the value of n:");
	scanf("%d",&n);
	printf("enter 1--> even:\n");
	printf("enter 2--> odd:\n");
	printf("enter 3--> pallindrome:\n");
	printf("enter 4--> Positive :\n");
	printf("enter 5--> Negative:\n");
	printf("enter 6--> sum:\n");
	printf("enter 7--> reverse no:\n");
	int choice;
	scanf("%d",&choice);
	if(choice==1){
		if(n %2 ==0){
			printf("%d is even ",n);
			
		}
		else{
			printf("%d is Not even ",n);	
		}
		
	}
	else if(choice==2){
		
		if(n %2 !=0){
			printf("%d is Odd ",n);
			
		}
		else{
			printf("%d is Not Odd",n);	
		}
	}
	else if(choice==3){
		int temp,rev=0,digit;
		temp=n;
		while(temp>0){
			digit = temp%10;
			rev =rev*10+digit;
			temp=temp/10;
		}
		if(rev==n){
				printf("%d is Pallindrome",n);
					
		}else{
				printf("%d is Not Pallindrome",n);	
		}
		
	}
	else if(choice==4){
		
	}
	else if(choice==5){
		
	}
	else if(choice==6){
		
	}
	else if(choice==7){
		
	}
}