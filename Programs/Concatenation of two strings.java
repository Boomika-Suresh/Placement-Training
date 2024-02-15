public class Main {
    public static void main(String[] args) {
        String str1 = "Boomika";
        String str2 = "Awesome";
        String converted = "";
        int len1 = str1.length();
        char first_letter = str2.charAt(0); 
        
        //If the first letter of the second word is caps then convert it into lowercase
        if(first_letter >='A' && first_letter <='Z')
        {
            first_letter = (char)(first_letter + 32);
        }
        converted = first_letter + converted;
        
        //Initialize a new empty string and then concatenate the elements of the second string to the new string
        for(int i=1;i<str2.length();i++)
        {
            converted = converted + str2.charAt(i);
        }
        System.out.println(converted);
        
        //str2.charAt(0) = first_letter; This is not possible because strings are immutable in java!
        
        if (str1.charAt(len1 - 1) == converted.charAt(0)) {
            System.out.println(str1 + converted.substring(1)); 
        }
        else
        {
            System.out.print("The last character of the first string and the first character of the second string do not match!");
        }
    }
}