import java.lang.String;
public class Substring {
    public static void main(String args[])
    {
        String input = "Zohocorporationteam";
        String substring1 = input.substring(0,7);
        String substring2 = input.substring(7,12);
        String substring3 = input.substring(12,19);
        int len1 = substring1.length();
        int len2 = substring2.length();
        int len3 = substring3.length();
        int i=0;
        while(i<len1)
        {
            System.out.print(substring1.charAt(i)); 
            System.out.print(" ");
            i++;
        } 
        System.out.println();
        int k = 0;
        while (k < len2)
        {
        int j = len2 - 1 - k;
        while (j > 0)
        {
            System.out.print("   ");
            j--;
        }
        System.out.println(substring2.charAt(k));
        k++;
        }
        int j=0;
        //System.out.println();
        while(j<len3)
        {
            System.out.print(substring3.charAt(j)); 
            System.out.print(" ");
            j++;
        } 
        
       
        
    }
}

/*
 OUTPUT:
    Z o h o c o r 
              p
            o
          r
        a
     t
    i o n t e a m
 */
