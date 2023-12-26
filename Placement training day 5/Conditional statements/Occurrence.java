import java.util.Scanner;
import java.lang.String;
public class Occurrence {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the string:");
        String input = sc.next();
        int n = input.length();
        for(int i=0;i<n;i++)
        {
            count = 1;
            for(int j=i+1;j<n;j++)
            {
                if(input.charAt(i)==input.charAt(j))
                {
                    count++;
                    i++;
                }
            }
            System.out.print(input.charAt(i)+""+count);
        }

    }
}
/*
OUTPUT:
    Enter the string:
    AABBBCCCCCDDEEEEFF
    A2B3C5D2E4F2
*/
