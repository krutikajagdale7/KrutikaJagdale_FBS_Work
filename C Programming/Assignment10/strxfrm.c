//SYNTAX:size_t strxfrm(char *dest, const char *src, size_t n);
//ransforms a string into a form that can be compared using strcmp(),
//equivalent to how strcoll() would compare them.
//strxfrm = is scan first and then it will acompare
//Useful when you need to sort many strings using locale rules efficiently — you preprocess them once with strxfrm() and then just call strcmp().
#include<stdio.h>
#include<string.h>
int main(){
char src[]="krutika", dest[20];
size_t len =strxfrm(dest , src,sizeof(dest));
printf("Transformed str:%s\n",dest);
printf("Length:%d",len);


}


