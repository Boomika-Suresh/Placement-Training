#include<stdio.h>

//call by value
void swap1(int a, int b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
	printf("The value after swapping is: \na = %d \nb = %d",a,b);
}

//call by reference
void swap2(int *a,int *b)
{
	int temp2;
	temp2 = *a;
	*a = *b;
	*b = temp2;
	printf("The value after swapping is: \na = %d \nb = %d",*a,*b);
}
int main()
{
	int a,b;
	printf("***********************CALL BY VALUE*************************");
	printf("\nEnter the value of a :");
	scanf("%d",&a);
	printf("Enter the value of b :");
	scanf("%d",&b);
	swap1(a,b);
	printf("\n\nDUE TO CALL BY VALUE ACTUAL PARAMETERS DON'T CHANGE");
	printf("\n\nThe value after swapping is: \na = %d \nb = %d",a,b);
	
	printf("\n\n***********************CALL BY REFERENCE*************************");
	printf("\nEnter the value of a :");
	scanf("%d",&a);
	printf("Enter the value of b :");
	scanf("%d",&b);
	swap2(&a,&b);
	printf("\n\nDUE TO CALL BY REFERENCE ACTUAL PARAMETERS CHANGE");
	printf("\n\nThe value after swapping is: \na = %d \nb = %d",a,b);
	
}
