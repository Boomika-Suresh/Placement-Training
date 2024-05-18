/*
A MxN matrix is passed as the input. The program must rotate the matrix by 90 degrees in anti-clock wise direction and
print the rotated matrix as the output.

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
3
459
135

Output:
95
53
41

Example Input/Output 2:
Input:

4

4

1234
5678
9 10 11 12
13 14 15 16

Output:
4 8 12 16
3 7 11 15
2 6 10 14
159 13
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
    
  for(int j=n-1;j>=0;j--){
    for(int i=0;i<n;i++){
      System. out. print (arr[i][j]+" ");
    }
    System.out.println();
  }
