#include<stdio.h>
int main()
{
	char shape;
	float size,area;
	printf("1. S - Square\n2.C - Circle\nEnter your choice: ");
	scanf("%c",&shape);
	switch(shape)
	{
		case 'S':
			printf("Enter the size:");
			scanf("%f",&size);
			area = size*size;
			printf("Area of Square = %.2f",area);
			break;
			
		case 'C':
			printf("Enter the size:");
			scanf("%f",&size);
			area = 3.14159 * size * size;
			printf("Area of Circle = %.2f",area);
			break;
	
	}
}
