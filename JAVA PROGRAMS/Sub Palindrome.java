/*
Given a string S, the program must print the count of sub palindromes (with a minimum length of two
characters) in the string S.

Boundary Conditions:
Length of the string is between 2 and 200.

Input Format:
First line will contain the string value S.

Output Format:
First line will contain the integer which represents the count of sub palindromes in the string S.

Sample Input/Output:

Example 1:
Input:
everest

Output:
2

Explanation:
The sub palindromes are eve, ere

Example 2:
Input:
abccbaab

Output:

5

Explanation:
The sub palindromes are cc, bccb, aa, baab, abccba
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        // Iterate over all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }

    // Helper method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
