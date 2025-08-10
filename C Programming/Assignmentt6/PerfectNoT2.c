#include<stdio.h>
int PerfectNo();
void main(){
	int res = PerfectNo();
	if(res==1){
			printf(" \n No is Perfect Number");
	}else
	{
		printf("\n No is  NOT Perfect Number");
	}
}

int PerfectNo(){
	int n = 28 , sum=0, i=1;
	while(i<n){
		if(n%i==0){
			sum=sum+i;
		}
		i++;
	}
	if(sum==n){
	  return 1;
	}
	else{
		return 2;
	}
	
}//Perfectno fun ends here