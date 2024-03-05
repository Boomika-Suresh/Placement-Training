//Merge Strings ALternatively
/* TIME TAKEN : 6 ms
   SPACE TAKEN: 42.86 mb 
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
	    //String word1 ="abc",word2= "pqrst";
	    String newString = "";
	    int len1,len2;
        len1 = word1.length();
        len2 = word2.length();
        if(len1 == len2)
        {
            for(int i =0;i<len1;i++)
            {
                newString += word1.charAt(i);
                newString += word2.charAt(i);  
            }
        }
        else if(len1>len2)
        {
            for(int i =0;i<len2;i++)
            {
                newString += word1.charAt(i);
                newString += word2.charAt(i);  
            }
            String sub = word1.substring(len2,len1);
            newString += sub;
        }
        else{
            for(int i =0;i<len1;i++)
            {
                newString += word1.charAt(i);
                newString += word2.charAt(i);  
            }
            String sub = word2.substring(len1,len2);
            newString += sub;
        }
        //System.out.print(newString);
         return newString;
	}
   
}

 