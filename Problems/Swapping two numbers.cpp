#include<stdio.h>
int main()
{
	int num1,num2;
	
	//Get the first input
	printf("Enter the first number:");
	scanf("%d",&num1);
	
	//Get the second input
	printf("Enter the second number:");
	scanf("%d",&num2);
	
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	
	//Print the result
	printf("num1 = %d\n",num1);
	printf("num2 = %d",num2);	
}
