import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
       String string1="",string2="";
       int n=0,i=0;
       Scanner sc = new Scanner(System.in) ;
       System.out.print("Enter a string 1: ");
       string1 = sc.next();
       System.out.print("Enter a string 2: ");
       string2 = sc.next();
       n=string1.length()>string2.length()?string1.length():string2.length();
       //System.out.print(n);
       if(string1.length()!=string2.length())
       {
           System.out.print("Strings are not equal");
       }
       else{
          while(i<n && string1.charAt(i)==string2.charAt(i))
          {
               i++;
          }
       
           if(i==n)
           {
               System.out.print("Strings are equal");
           }
           else{
               System.out.print("Strings are not equal");
           }
       }
      
       
    }
}
