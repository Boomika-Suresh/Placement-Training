/*Create a Java class named Calculator with two methods:
i) multiply method that takes two integers and returns their product.
ii) multiply method overload that takes three doubles and returns their product.
Write a simple program to demonstrate the use of method overloading by calling both versions of the multiply method and printing the results. */

package Overloading_Overriding;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj1 = new Calculator();
        System.out.println("=================================================================");
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int integer_product = obj1.product(a,b);
        System.out.println("The product of two integers "+a+" and "+b+" is "+integer_product);

        System.out.println("=================================================================");
        Calculator obj2 = new Calculator();
        System.out.print("Enter first double: ");
        double a1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter third double: ");
        double c1 = sc.nextDouble();
        double double_product = obj2.product(a1,b1,c1);
        System.out.println("The product of two integers "+a1+","+b1+" and "+c1+" is "+double_product);
        System.out.println("=================================================================");
    }
}
class Calculator{
    int product(int a,int b)
    {
        return a*b;
    }
    
    double product(double a,double b,double c)
    {
        return a*b*c;
    }
}

/*
 OUPTUT:
    =================================================================
    Enter first integer: 6
    Enter second integer: 8
    The product of two integers 6 and 8 is 48
    =================================================================
    Enter first double: 3.2
    Enter second double: 4.1
    Enter third double: 2.2
    The product of two integers 3.2,4.1 and 2.2 is 28.864
    =================================================================
 */
