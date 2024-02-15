import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		n = sc.nextInt();
		
		for(i=n;i>=1;i--)
		{
		    for(j=i;j<2*n;j++)
		    {
		        if(i+j <= 2*n)
		        {
		            System.out.print("* ");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}
