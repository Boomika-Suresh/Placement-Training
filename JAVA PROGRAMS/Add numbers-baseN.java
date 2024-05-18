/*
Two numbers X and Y are provided with reference to base N. Add the numbers and print their sum with
reference to base 10.

Input Format:
First line will contain the value of N.
Second line will contain X and Y separated by one or more spaces.

Output Format:
First line will contain the sum of X and Y to the base 10.

Boundary Conditions:
1 <= N <= 10

Example Input/Output 1:
Input:
2
1010 11

Output:
13

Explanation:
1010 to the base 2 is 10. 11 to the base 2 is 3.
Hence the sum is 10+3 = 13.

Example Input/Output 2:
Input:
3
11 201

Output:
23

Explanation:
11 to the base 3 is 4. 201 to the base 3 is 19.
Hence the sum is 23
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the base
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character after the integer input

        // Read the two numbers as a single line
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        // Parse the two numbers from the string array
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        // Convert number a from base n to base 10
        int xbase = 0;
        int i = 0;
        while (a > 0) {
            int rem1 = a % 10;
            xbase += rem1 * Math.pow(n, i);
            a = a / 10;
            i++;
        }

        // Convert number b from base n to base 10
        int ybase = 0;
        int j = 0;
        while (b > 0) {
            int rem2 = b % 10;
            ybase += rem2 * Math.pow(n, j);
            b = b / 10;
            j++;
        }

        // Print the sum of the two numbers in base 10
        System.out.println(xbase + ybase);
    }
}
