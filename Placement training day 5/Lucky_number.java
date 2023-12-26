import java.util.Scanner;
public class Lucky_number{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = sc.nextInt();
        int result =num1;
        while(result!=1)
        {
            result = happy_num(result);
        }
        if(result==1)
        {
            System.out.println("True : The given number is a happy number!");
        }
        else{
            System.out.println("False : The given number is not a happy number!");
        }
        
    }
    public static int happy_num(int num)
    {
        int mod=0,square=0;
        while(num>0)
        {
            mod = num%10;
            square += (mod*mod);
            num = num/10;
        }
        num = square;
        return num;
    }
}