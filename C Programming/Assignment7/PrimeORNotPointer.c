#include <stdio.h>

void PrintPrimeNo(int*);

void main() {
    int n;
    printf("Enter Num: ");
    scanf("%d", &n);
    PrintPrimeNo(&n);
}

void PrintPrimeNo(int* n) {
    int i, j, isPrime;

    for(i = 2; i <= *n; i++) {
        isPrime = 1; // assume i is prime

        for(j = 2; j <= i/2; j++) {
            if(i % j == 0) {
                isPrime = 0; // i is not prime
                break;
            }
        }

        if(isPrime == 1) {
            printf("%d is a Prime number.\n", i);
        } else {
            printf("%d is NOT a Prime number.\n", i);
        }
    }
}
