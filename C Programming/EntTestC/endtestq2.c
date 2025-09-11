#include <stdio.h>
int ReverseNO(int num, int rev);
int main() {
    int number, reversed;
    printf("Enter a number: ");
    scanf("%d", &number);

    reversed = ReverseNO(number, 0);

    printf("\nrversed number: %d", reversed);

    return 0;
}

int ReverseNO(int num, int rev) {
    if (num == 0){
    	 return rev;  
	}
       
    return ReverseNO(num / 10, rev * 10 + num % 10);
}
