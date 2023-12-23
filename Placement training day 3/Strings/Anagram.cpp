#include<stdio.h>
int main(){
	char input1[100],input2[100];
	int i;
	int count1[256]={0},count2[256]={0},flag,length1=0,length2=0;
	
	printf("Enter the string s = ");
	scanf("%s",&input1);
	printf("Enter the string t = ");
	scanf("%s",&input2);
	
	printf("\ns = '%s' ",input1);
	printf("\nt = '%s' ",input2);
	
	//Checking Anagram
	for(int i=0;input1[i]!='\0';i++)
	{
		length1++;
	}
	
	for(int i=0;input2[i]!='\0';i++)
	{
		length2++;
	}
	
	if(length1!=length2)
	{
		printf("\nFalse");
	}
	else
	{
		for(i=0;i<length1;i++)
		{
			count1[input1[i]]++;
			count2[input2[i]]++;
		}	
	
		//Checking characters
	
		for(i=0;i<256;i++)
		{
			if(count1[i]!=count2[i]){
				printf("\nFalse");
				break;
			}
		}
		if(i==256)
		{
			printf("\nTrue");
		}
	}
	}
		
	
	

