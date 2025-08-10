 #include<stdio.h>
 void PrintPerfectNo(int);
void main(){
	int n;
	printf("Enter the value of n:");
	scanf("%d",&n);
	printf("Perfect num from 1 to %d are: \n",n);
	 PrintPerfectNo(n);
	
} 
void PrintPerfectNo(int p){
	int i,j,sum;
	
	for( i=1;i<=p;i++){
	 sum=0;
	 for(j=1;j<i;j++){
	 	if(i%j==0){
	 		sum = sum+j;
		 }
		 
	 }
	 if(sum==i){
	 	printf("%d \n",i);
	 }
	
}
}