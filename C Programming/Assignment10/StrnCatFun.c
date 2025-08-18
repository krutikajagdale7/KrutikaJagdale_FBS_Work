//limit how many characters are appended  - strncat();//syntax:char *strncat(char *dest, const char *src, size_t n);//const means : src is once declared it will not modified only read
#include<stdio.h>
#include<string.h>
int main(){
	char src[]="Krutika";
	char dest[]="Jagdale";
	strncat(dest,src,5);
	printf("Conacated with only limited(given no):%s",dest);
	
}
