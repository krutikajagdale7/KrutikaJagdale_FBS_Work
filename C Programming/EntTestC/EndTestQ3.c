#include <stdio.h>
struct Product {
    int id;
    char name[50];
    float price;
    float discount;
    float finalPrice;
};

int main() {
    int n, i;

    printf("Enter number of products: ");
    scanf("%d", &n);

    struct Product products[n];


    for (i = 0; i < n; i++) {
        printf("\nEnter details for product %d:\n", i);
        printf("ID: ");
        scanf("%d", &products[i].id);

        printf("Name: ");
        scanf("%s", &products[i].name);

        printf("Price: ");
        scanf("%f", &products[i].price);

       
        if (products[i].price > 500){
        	products[i].discount = 0.20 * products[i].price;
		}
            
        else{
        	products[i].discount = 0.05 * products[i].price;
		}

        products[i].finalPrice = products[i].price - products[i].discount;
    }

  
    printf("\n%s  %s  %s  %s  %s\n", "ID", "Name", "Price", "Discount", "FinalPrice");

    for (i = 0; i < n; i++) {
        printf("%d  %s  %f  %f  %f\n", products[i].id, products[i].name, products[i].price, products[i].discount, products[i].finalPrice);
    }

    return 0;
}
