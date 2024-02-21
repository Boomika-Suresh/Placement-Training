import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int a =0,b=1;
		int c=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit: ");
		n = sc.nextInt();
		System.out.print(a+","+b);
		while(n-2>0)
		{
		    c=a+b;
		    System.out.print(","+c);
		    a=b;
		    b=c;
		    n--;
		}
		}
}

//Output:
//Enter the limit: 6
//0,1,1,2,3,5,8
