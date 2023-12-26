import java.util.Scanner;
public class Odd_Even_array1
{
    public static void main(String args[])
    {
        int arr[] = new int[10];
        int even_size=0,odd_size=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int odd_arr[] = new int[n];
        int even_arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int j =0,k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even_arr[j]=arr[i];
                j++;
                even_size++;
            }
            else
            {
                odd_arr[k]=arr[i];
                k++;
                odd_size++;
            }
            
        }
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d,",arr[i]);
        }
        System.out.print("\b]");

        System.out.println();
        System.out.print("[");
        for(j=0;j<even_size;j++)
        {
            System.out.printf("%d,",even_arr[j]);
        }
        System.out.print("\b]");

        System.out.println();
        System.out.print("[");
        for(k=0;k<odd_size;k++)
        {
            System.out.printf("%d,",odd_arr[k]);
        }
        System.out.print("\b]");
        

    }
}