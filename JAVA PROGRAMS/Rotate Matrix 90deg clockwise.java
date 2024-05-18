/*
A MxN matrix is passed as the input. The program must rotate the matrix by 90 degrees in clock wise direction and print the
rotated matrix as the output.

Input Format:
First line will contain the value of M.
Second line will contain the value of N.
Next M lines will contain the N values with each value separated by one or more space.

Output Format:
N lines will contain the M values with each value separated by one or more space.

Boundary Conditions:
2 <= M <= 15
2 <= N <= 15

Example Input/Output 1:
Input:
2

459
135

Output:
14
35
59

Example Input/Output 2:
Input:

4
4

1234
5678
9 10 11 12
13 14 15 16

Output:
13951
14 10 6 2
15 11 73
16 12 8 4
*/

import java.util .*;
public class Hello {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int m = sc.nextInt();
  int n = sc.nextInt();
  int arr[][] = new int[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        arr[i][j] = sc.nextInt();}}
    
  for(int j=0;j<n;j++){
    for(int i=n-1;i>=0;i--){
      System. out. print (arr[i][j]+" ");
    }
    System.out.println();
  }
