#include<stdio.h>
int Armstrong(int);
int getCount(int);
int power(int,int);
void main(){
	int n;
	printf("enter no:");
	scanf("%d",&n);
	 int res =Armstrong(n);
	 if(res==1){
	 	printf("NO is Armstrong.");
	 }else{
	 	printf("NO is NOT armstrong");
	 }
}

int getCount(int no)
{    int count =0;
	while(no>0){
	count++;
	no=no/10;
	}
	
   return count;
}
int power(int base, int exp){
		int res =1;
		for(int i=1;i<=exp;i++){
			res =res*base;
		}
		return res;
		
}

int Armstrong(int no){ //def
	int rem, sum=0, temp=no;
	int count = getCount(no);
	
	while(no>0){
		rem = no%10;
		int res = power(rem, count);
		sum = sum+res;
		no = no/10;
	}	
	
	if(sum==temp){
		return 1;
	}else
	{
		return 0;
	}
}//armstrong fun is ends here