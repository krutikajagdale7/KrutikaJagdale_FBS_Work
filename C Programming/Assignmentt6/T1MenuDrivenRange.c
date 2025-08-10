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
	printf("enter 4--> Perfect No :\n");
	printf("enter 5--> Strong:\n");
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
		int num = 28;
	int i = 1;
	int sum = 0;
	while(i< num){
		if(num%i==0){
			sum = sum+i;
		}
		i++;
		
	}
	if(sum == num){
		printf("no is Perfrct", num);
	}
	else{
		printf("no is NOT Perfect", num);
	}
		
	}
	else if(choice==5){
		int num, temp, digit, i, fact, sum = 0;

    // Input number
    //printf("Enter a number: ");
    //scanf("%d", &num);

    temp = num;

    while (temp > 0) {
        digit = temp % 10;

        // Calculate factorial of digit
        fact = 1;
        for (i = 1; i <= digit; i++) {
            fact = fact * i;
        }

        sum = sum + fact;
        temp = temp / 10;
    }

    // Check if number is Strong
    if (sum == num) {
        printf("%d is a Strong Number.\n", num);
    } else {
        printf("%d is not a Strong Number.\n", num);
    }

	}
	else if(choice==6){
		int start = 1 , end = 5, sum = 0;
	while(start<=end){
	   sum += start;//sum = sum +start;
	   start++;//1,2,3,4,5   
	   //sum = 0+1, 1+2, 3+3, 6+4,10+5 = 15
	   
		
	}
	printf("sum: %d",sum);
	}
	else if(choice==7){
		int n, reverse = 0, digit;

    // Input number
    printf("Enter a number: ");
    scanf("%d", &n);

    while (n != 0) {
        digit = n % 10;           // Get last digit
        reverse = reverse * 10 + digit;  // Build reversed number
        n = n / 10;             // Remove last digit
    }

    printf("Reversed number is: %d\n", reverse);
	}
}