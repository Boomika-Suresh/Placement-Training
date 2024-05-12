/*A number N indicating the number of rows in Floyd's triangle is passed as the input. The program must print the Floyd's
triangle pattern.

Input Format:
The first line will contain N.

Output Format:
The first N lines will contain the Floyd's triangle pattern.

Boundary Conditions:
3 <= N <= 50

Example Input/Output 1:
7

Output:

23
456
789 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28

1

Example Input/Output 2:
Input:

5

Output:
1
23
456
78910
11 12 13 14 15*/



import java.util .*;
public class Hello {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int counter=1;
for(int i=0;i<n;i++)
{

for(int j=0;j<n;j++)

if(j <= i)

System.out.print(counter+" ");
counter++;

}
System.out.println();

System.out.println("Hello");

}

}