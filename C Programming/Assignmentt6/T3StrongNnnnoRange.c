#include <stdio.h>

void PrintStrongNO(int);

void main() {
	int n;
	printf("Enter the value of n: ");
    scanf("%d", &n);

    printf("Strong numbers from 1 to %d are:\n", n);
	
    PrintStrongNO(n);	
}

void PrintStrongNO(int s) {
    int i, j, sum, temp, digit, fact;

    
    for(i = 1; i <= s; i++) {
        temp = i;
        sum = 0;

        while(temp > 0) {
            digit = temp % 10;

            fact = 1;
            for(j = 1; j <= digit; j++) {
                fact = fact * j;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if(sum == i) {
            printf("%d\n", i);  // ? Fixed: Print the value of i
        }
    }
}
