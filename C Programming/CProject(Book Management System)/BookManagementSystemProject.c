#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Book{
	int book_id;
	char book_name[100];
	char book_authorname[100];
	char book_category[50];
	float book_price;
	float book_rating;
	
} Book;
//void addbooks(Book *books, int n);
Book* addNewbooks(Book *books, int* n);
void displayAllbooks(Book* books, int n);
void searchbooks(Book* books,int n);
void updatebooks(Book* books,int n);
void displaySortedbooks(Book* books , int n);
void Showbookbycategory(Book *books, int n);
void ShowbookbyAuthorName(Book *books, int n);
void removebooks(Book* books,int* n);

int main(){
	
int n=3,choice;
//printf("Enter No of Elements: ");
//scanf("%d",&n);
Book *books=(Book*)malloc(n*sizeof(Book));
if (books == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }
books[0] = (Book){101, "CProgramming", "DennisRitchie", "Programming", 450.50, 4.5};
books[1] = (Book){102, "BI", "YPK", "Programming", 300.00, 4.2};
books[2] = (Book){103, "DSA", "ABC", "Algorithms", 550.75, 4.7};

   //addbooks(books, n);

    do {
        printf("\n--- Book Management System ---\n");
        printf("1. Add NewBook\n");
        printf("2. Display Books\n");
        printf("3. Search Book\n");
        printf("4. Update Book\n");
        printf("5. Display Sorted Books\n");
        printf("6. Show Book by category\n ");
        printf("7. Show Book by AuthorName\n");
        printf("8. Remove Book\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
 switch(choice) {
        	case 1:
            books=addNewbooks(books, &n);
        	break;
            case 2: 
			displayAllbooks(books, n); 
			break;
            case 3: 
			searchbooks(books, n); 
			break;
            case 4: 
			updatebooks(books, n);
			 break;
            case 5: 
			displaySortedbooks(books, n);
			break;
			case 6: 
			Showbookbycategory(books, n);
			break;
			case 7:
			ShowbookbyAuthorName(books, n);
			break;
			case 8: 
			removebooks(books, &n);
			 break;
			case 9:
				printf("Exiting...\n");
			break;
            default: 
			printf("Invalid choice!\n");
        }
   } while(choice != 9);

    free(books);
    return 0;
}

//void addbooks(Book *books, int n) {
//    for (int i = 0; i < n; i++) {
//        printf("\nEnter details of Book %d:\n", i+1);//we take also i+1 because human mentality is start as 1 but array is strat from 0 index.
//        printf("Enter Book ID: ");
//        scanf("%d", &books[i].book_id);
//        printf("Enter Book Name: ");
//        scanf(" %s", books[i].book_name);
//        printf("Enter Author Name: ");
//        scanf(" %s", books[i].book_authorname);
//        printf("Enter Category: ");
//        scanf(" %s", books[i].book_category);
//        printf("Enter Price: ");
//        scanf("%f", &books[i].book_price);
//        printf("Enter Rating: ");
//        scanf("%f", &books[i].book_rating);
//    }
//}//add fun end here
Book* addNewbooks(Book *books, int* n) {
	
    
    int newSize = *n + 1;
    Book *temp = (Book*)realloc(books, newSize * sizeof(Book));
    if (temp == NULL) {
        printf("Memory reallocation failed!\n");
        return books; // return old pointer if realloc fails
    }
    books = temp;

    // Input details for new book
    printf("\nEnter details of New Book:\n");
    printf("Enter Book ID: ");
    scanf("%d", &books[*n].book_id);
    printf("Enter Book Name: ");
    scanf(" %s", books[*n].book_name);
    printf("Enter Author Name: ");
    scanf(" %s", books[*n].book_authorname);
    printf("Enter Category: ");
    scanf(" %s", books[*n].book_category);
    printf("Enter Price: ");
    scanf("%f", &books[*n].book_price);
    printf("Enter Rating: ");
    scanf("%f", &books[*n].book_rating);

    *n = newSize;  // update count
    printf("Book added successfully!\n");

    return books; // return updated pointer
}///addnew end here

void displayAllbooks(Book* books, int n){
	printf("\n-----ALL BOOK LIST------");
	for(int i=0;i<n;i++){
		
		printf("\nBook_ID %d",books[i].book_id);
		printf("\nBook_Name:%s",books[i].book_name);
		printf("\nBook_AuthorName:%s",books[i].book_authorname);
		printf("\nBook_Category:%s",books[i].book_category);
		printf("\nBook_Price:%f",books[i].book_price);
		printf("\nBook_Rating:%f",books[i].book_rating);
		
	}
}//displayallend here
void searchbooks(Book* books,int n){
	printf("-----Search Books-----");
    if(n==0){
    	printf("No Book for Search.");
	}

    int choice, found = 0;
    printf("\nSearch by:\n");
    printf("1. Book ID\n");
    printf("2. Book Name\n");
    printf("Enter choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        int id;
        printf("Enter Book ID to search: ");
        scanf("%d", &id);

        for (int i = 0; i < n; i++) {
            if (books[i].book_id == id) {
                 printf("Found: %s wrote by %s\n ",books[i].book_name, books[i].book_authorname);
				 printf("Category: %s\n", books[i].book_category); 
				 printf("Price: %f\n",books[i].book_price);
				 printf("Rating: %1f\n",books[i].book_rating);
                found = 1;
                break;
            }
        }
    }
    else if (choice == 2) {
        char name[100];
        printf("Enter Book Name to search: ");
        scanf(" %s", &name);

        for (int i = 0; i < n; i++) {
            if (strcmp(books[i].book_name, name) == 0) {
                 printf("Found: %s wrote by %s:\n ",books[i].book_name, books[i].book_authorname);
				 printf("Category: %s\n", books[i].book_category); 
				 printf("Price: %f\n",books[i].book_price);
				 printf("Rating: %.1f\n",books[i].book_rating);
                       
                      
                found = 1;
                break;
            }
        }
    }
    else {
        printf("Invalid choice!\n");
        return;
    }

    if (!found)
        printf("Book not found!\n");
}//search end here
void updatebooks(Book* books,int n){
	printf("----here We can Update Books----");
	if(n==0){
		printf("\n No Books for Update.");
	}
	int bookid, found =0;
	printf("\nEnter Book_Id ofr Update:");
	scanf("%d",&bookid);
	for(int i=0;i<n ; i++){
		if(books[i].book_id==bookid){
			printf("\nEnter new Book Name:");
			scanf("%s",books[i].book_name);
			printf("\nEnter new Author Name:");
			scanf("%s",books[i].book_authorname);
			printf("\nEnter new Category of Book:");
			scanf("%s",books[i].book_category);
			printf("Enter new Price: ");
            scanf("%f", &books[i].book_price);
            printf("Enter new Rating: ");
            scanf("%f", &books[i].book_rating);
            printf("Book updated successfully!\n");
            found = 1;
            break;
        }
    }
    if (!found) printf("Book not found!\n");
				
	}
//update end here
void sortBooksByPrice(Book *books, int n) {
    Book temp;
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (books[i].book_price < books[j].book_price) {
                temp = books[i];
                books[i] = books[j];
                books[j] = temp;
            }
        }
    }
}

void sortBooksByRating(Book *books, int n) {
    Book temp;
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (books[i].book_rating < books[j].book_rating) {
                temp = books[i];
                books[i] = books[j];
                books[j] = temp;
            }
        }
    }
}

void displaySortedbooks(Book *books, int n) {
	printf("-------Here Book Sorted Based on Price And Rating-------");
    int choice;
    printf("\nSort books by:\n");
    printf("1. Price \n");
    printf("2. Rating \n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        sortBooksByPrice(books, n);
    } else if (choice == 2) {
        sortBooksByRating(books, n);
    } else {
        printf("Invalid choice!\n");
        return;
    }

    printf("\n--- Sorted Book List ---\n");
    displayAllbooks(books, n);
}
//displaysort here

void Showbookbycategory(Book *books, int n){
	
	printf("----- Here Book is show based on category------");
	int found =0;
	char category[100];
	printf("\nEnter Category for Search :");
	scanf("%s",&category);
	
	for(int i=0;i<n;i++){
		if(strcmp(books[i].book_category,category)==0){
				 printf("Book Name: %s\n",books[i].book_name);
		         printf("Author Name: %s\n",books[i].book_authorname);                      
				 printf("Category: %s\n", books[i].book_category); 
				 printf("Price: %f\n",books[i].book_price);
				 printf("Rating: %f\n",books[i].book_rating);
				 found = 1;
		}
	}
	if (!found) {
        printf("No books found by this category\n");
    }
	

}//category end here
void ShowbookbyAuthorName(Book *books, int n){
		printf("----- Here Book is show based on Author Name------");

	int found =0;
	char authorname[100];
	printf("\nEnter Author Name to search: ");
	scanf("%s",&authorname);
	for(int i=0;i< n;i++){
		if(strcmp(books[i].book_authorname,authorname)==0){
				 printf("Book Name: %s\n",books[i].book_name);
		         printf("Author Name: %s\n",books[i].book_authorname);                      
				 printf("Category: %s\n", books[i].book_category); 
				 printf("Price: %f\n",books[i].book_price);
				 printf("Rating: %f\n",books[i].book_rating);
				 found = 1;
		}
	}
	if (!found) {
        printf("No books found by this author\n");
    }
}
//author name end here
void removebooks(Book* books,int* n){
	printf("-----Remove Books----");
	if(*n==0){
		printf("\nNo Book For Remove.");	
	}
	int bookid, found=-1;
	printf("\nEnter Bookid which have to Remove:");
	scanf("%d",&bookid);
	for(int i=0;i<*n;i++){
		if(books[i].book_id==bookid){
			found =i;
			break;
		}
	}
	if(found==-1){
		printf("Book ID not Found");
		return;
	}
	for(int i=found;i<*n-1;i++){
		books[i]=books[i+1];
		}
		(*n)--;
		printf(" Book Remove Successfully!!");
	
}//remove end here
	



	