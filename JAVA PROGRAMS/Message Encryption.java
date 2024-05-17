/*
To encrypt messages Jil will first decide on the number of columns C to use. Then Jil will pad the message with letters chosen randomly so that they form a rectangular matrix. Finally Jil will write down the
message navigating the rows from left to right and then from right to left.

The program must accept the encrypted message M as input and then extract and print the original message (along with any additional padding letters) from the encrypted one based on the value of C.

Boundary Conditions:
Length of M is from 4 to 200.
2 <= C <= 20

Input Format:
First line will contain the string value of the encrypted message M.
Second line will contain the integer value of the column used for the encryption.

Output Format:
First line will contain the string value of the original message (along with any additional padding letters)

Sample Input/Output:

Example 1:
Input:
midinadiazne

3

Output
madeinindiaz

Explanation
mic
ani
dia
enz
Here z is the padding letter. The navigating across the rows mid (left to right) ina (right to left) and so on we come up with the encrypted message midinadiazne.

Example 2:
Input
loaesfbnaiordilertenrdhdw

5

Output:
lionroaredandthebirdsflew

Explanation:
loaes
ianbf
ordil
netre
rdhdw
Here there are no padding letters. The navigating across the rows left to right and then from right to left we get loaesfbnaiordilertenrdhdw
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int len = s.length();
		int m = (int) Math.ceil((double) len / n);
		char matrix[][] = new char[m][n];
		int k=0;
		for(int i=0;i<m;i++)
		{
		    if(i%2==0){
    		    for(int j=0;j<n;j++)
    		    {
    		        if(k<s.length())
    		        {
    		            matrix[i][j]=s.charAt(k);
    		            k++;
    		        }
    		    }
		    }
		    else{
		       for(int j=n-1;j>=0;j--)
    		    {
    		        if(k<s.length())
    		        {
    		            matrix[i][j]=s.charAt(k);
    		            k++;
    		        }
    		    } 
		    }
		}
		/*for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(matrix[i][j]);
		    }
		    System.out.println();
		}*/
		//midinadiazne 3
	    
	    String result = "";
	    for(int j=0;j<n;j++)
	    {
	        for(int i=0;i<m;i++)
	        {
	            result+=matrix[i][j];
	        }
	    }
	    System.out.print(result);
	}
}
