/*
An array of N integers with non-zero values is passed as the input to the program. The
program must print another array of size N where value at each index will be the product of all
values in the input array except the value at that index in the input array.

Input Format:
The first line will contain N integers separated by a space.

Output Format:
The first line will contain N integers separated by a space.

Boundary Conditions:
The length of the input containing N integers will be from 3 to 100.
The integer values will be from 1 to 100.

Example Input/Output 1:
Input:
12345

Output:
120 60 40 30 24

Example Input/Output 2:
Input:
1054

Output:
20 40 50

Example Input/Output 3:
Input:
21 100

Output:
100 21
*/

import java.util .*;
public class Hello {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int product=1;
	ArrayList <Integer> input = new ArrayList<>();
	String arr[] = s.split(" ");
	for(String word: arr){
		int val = Integer.parseInt(word);
		input.add(val);
		product = product*val;
	}
	System.out.print(product);
	System.out.println();
	for(int i=0;i<input.size();i++)
	{
		System.out.print(product/input.get(i)+"");
	}

}
