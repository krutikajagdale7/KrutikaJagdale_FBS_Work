#include <stdio.h>

int main() {
    char str[100];
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    printf("enter a string: ");
    scanf("%s", str);  
    int i=0;
    while(str[i] !='\0') {
        char ch = str[i];

    if ((ch >= 'a' && ch <= 'z')|| (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            	vowels++;
			}
                
    else{
			consonants++;
			}
               
        }
        else if (ch >= '0' && ch <= '9') {
            digits++;
        }
          else if (ch == ' ') {
            spaces++;
        }
        i++;
    }

    printf("vowels: %d\n", vowels);
    printf("consonants: %d\n", consonants);
    printf("Digits: %d\n", digits);
    printf("spaces: %d\n", spaces);

    return 0;
}
