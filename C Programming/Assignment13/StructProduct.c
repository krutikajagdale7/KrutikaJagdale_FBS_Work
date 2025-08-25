#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Product{
	int Product_id;
	char Product_Name[30];
	double Product_quantity;
	double Product_Price;
	
};
void main(){
	
	struct Product P1, P2;
	P1.Product_id = 101;
	strcpy(P1.Product_Name,"HP");
	P1.Product_quantity = 5;
	P1.Product_Price = 50000;
	
	printf("# Product Details #\n");
	printf("\nDetails Of First Product:\n");
	printf("\nProduct_Id: %d", P1.Product_id);
	printf("\nProcduct_Name: %s",P1.Product_Name);
	printf("\nProduct_Quantity: %lf\n", P1.Product_quantity);
	printf("\nProduct_Price: %lf\n",P1.Product_Price);
	
	printf("\nEnter Details Of Second Product:\n");
	printf("Product_Id:");
	scanf("%d",&P2.Product_id);
	printf("Product_Name:");
	scanf("%s",&P2.Product_Name);
	printf("Product_Quantity:");
	scanf("%lf",&P2.Product_quantity);
	printf("Product_Price:");
	scanf("%lf",&P2.Product_Price);
	
	printf("\nDetails Of Second Product:\n");
	
	printf("\nProduct_Id: %d\nProduct_Name: %s\nProduct_Quantity: %lf\nProduct_Price:%lf", P2.Product_id,  P2.Product_Name, P2.Product_quantity, P2.Product_Price);
	
	
}