#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct Student{
	int rollno;
	char name[50];
	int marks;
};
void main(){
	struct Student s1, s2;
	s1.rollno = 59;
	strcpy(s1.name ,"krutika");
	s1.marks=85;
	printf("* Details Of Student * \n");
	printf("\nDetails Of First Student:");
	printf("\n RollNo: %d",s1.rollno);
	printf("\n Name Of Student: %d",s1.name);
	printf("\n Marks: %d",s1.marks);
	printf("\n Enter Details Of Second Student:\n");
	printf(" RollNo:");
	scanf("%d",&s2.rollno);
	printf(" Name of Student:");
	scanf("%s",&s2.name);
	printf(" Marks:");
	scanf("%d",&s2.marks);
	printf("\n RollNO:%d \n Name: %s \n Marks: %d", s2.rollno, s2.name, s2.marks);
}