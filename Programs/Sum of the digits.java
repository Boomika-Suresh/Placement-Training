import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
        n = sc.nextInt();
		int temp = n;
		
		while(n>0)
		{
		    temp = temp%10;
		    sum = sum + temp;
		    temp = n/10;
		}
		
		System.out.print(sum);
	}
}
