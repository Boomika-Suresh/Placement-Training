import java.util.Scanner;
import java.lang.ArithmeticException;
public class calculator {
    public static void main(String args[]){
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operation");
        System.out.print("1.+\n2.-\n3.*\n4./\n");
        char operation = input.next().charAt(0);
        System.out.print("Enter the first number:");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number:");
        double num2 = input.nextDouble(); 
        if(operation != '+' && operation!='-' && operation!='*' && operation!='/')
        {
            System.out.print("Invalid operator!");
        }
        else
        {
            if(num1 != 0 && num2 !=0){
                switch(operation)
                {
                    case '+':
                    {
                        result = add(num1,num2);
                        System.out.printf("The sum of %.2f and %.2f is %.2f",num1,num2,result);
                        break;
                    }
                    case '-':
                    {
                        result = sub(num1,num2);
                        System.out.printf("The subraction of %.2f and %.2f is %.2f",num1,num2,result);
                        break;
                    }
                    case '*':
                    {
                        result = multiply(num1,num2);
                        System.out.printf("The product of %.2f and %.2f is %.2f",num1,num2,result);
                        break;
                    }
                    case '/':
                    try {
                        result = divide(num1, num2);
                        System.out.printf("The division of %.2f and %.2f is %.2f", num1, num2, result);
                    } catch (ArithmeticException e) {
                        System.out.println("Invalid Operation: Cannot divide by zero");
                    }
                    break;

                }
            }
         }
        input.close();
    }
    public static double add(double a,double b){
        double sum=a+b;
        return sum;
    }
    public static double sub(double a,double b){
        double sub=a-b;
        return sub;
    }
    public static double multiply(double a,double b){
        double product=a*b;
        return product;
    }
    public static double divide(double a,double b){
        if(b==0)
        {
            throw new ArithmeticException("Invalid Operation");
            //return Double.NaN;
        }
        else
        {   
            double div=a/b;
            return div;
        }
        
    }
    
}
/*
OUTPUT:
Choose an operation
1.+
2.-
3.*
4./
/
Enter the first number:3.8
Enter the second number:0
Invalid Operation: Cannot divide by zero
*/
