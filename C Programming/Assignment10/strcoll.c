//strcoll
#include <stdio.h>
#include <string.h>

int main() {
    // No setlocale() here – defaults to "C" locale
    printf("Compare result: %d\n", strcoll("apple", "banana"));
    return 0;
}

