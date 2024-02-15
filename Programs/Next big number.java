import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1,3,5,7};
		/*int target,max = 0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a target: ");
		target = sc.nextInt();*/
		int j = arr.length,i=0;
		for(i=0;i<arr.length;i++)
		{
		    for(j=0;j<arr.length;j++)
		    if(arr[i+1] == arr[i]+1)
		    {
		        System.out.println("["+arr[i]+","+arr[i+1]+"]")
		    }
		    else
		    {
		        i++;
		    }
		}
		if(max==0)
		{
		    System.out.println("No next maximum!");
		}
		else
		{
		    System.out.println(max);
		}
		
		
	}
}