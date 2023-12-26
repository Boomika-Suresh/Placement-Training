import java.util.Scanner;
public class Average
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second floating-point number: ");
        float num2 = input.nextFloat();
        float average = (num1 + num2) / 2;
        System.out.printf("The average of the two numbers is %.2f",average);
        input.close();
	}
}
