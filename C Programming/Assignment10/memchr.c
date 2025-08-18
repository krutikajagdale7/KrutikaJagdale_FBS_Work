//SYNTAX:void *memchr(const void *ptr, int c, size_t n);

#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Krutika";
    char *ptr = memchr(str, 'k', strlen(str));
    if (ptr) {
        printf("Found 'k' at position: %ld\n", ptr - str);
    } else {
        printf("Not found\n");
    }
    return 0;
}
