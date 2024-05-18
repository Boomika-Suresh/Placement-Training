/*
Based on the input value of N, the program must print the pattern described below.

Input Format:
First line will contain the value of N.

Output Format:
N lines will contain the number pattern as described below with each value separated by a
single space.

Boundary Conditions:
1 <= N <= 50

Example Input/Output 1:
Input:
5

Output:
15 10 6 3 1
14 9 5 2
13 8 4
127
11

Example Input/Output 2:
Input:

3

Output:
6 3 1
5 2
4
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int counter=n;
		int num=0;
		
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		    sum+=i;
		}
		//System.out.print(sum);
		
		for(int i=1;i<=n;i++)
		{
		    num=sum;
		    System.out.print(num+" ");
		    for(int j=n-1;j>=1;j--)
		    {
		        if(i<=j)
		        {
		            num-=counter;
    		        System.out.print(num+" ");
    		        counter--;
		        }
		    }
		    System.out.println();
		    counter=n;
		    sum--;
		}
	}
}










