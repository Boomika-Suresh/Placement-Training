#include<stdio.h>
int main()
{
	int total_days,years,weeks,days;
	//Get the input of total days
	printf("Enter the total number of days:");
	scanf("%d",&total_days);
	
	//Calculate the number of years
	years = total_days/365;
	
	//Calculate the remaining days
	total_days %= 365;
	
	//Calculate the weeks
	weeks = total_days/7;
	
	//Calculate the days
	days = total_days%7;
	
	printf("Number of Years: %d\n",years);
	printf("Number of Weeks: %d\n",weeks);
	printf("Number of Days: %d\n",days);
}
