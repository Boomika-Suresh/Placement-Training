//Reversal of a string in java without changing the positions of spaces and special characters

public class Main
{
	public static void main(String[] args) {
		String sentence = "i# like to have tea";
		String reversedArray = " ";
		System.out.println(sentence);
		char characters[] = sentence.toCharArray();
		char temp;
		int i = 0,j=sentence.length()-1;
		while(i<j)
		{
		    if(characters[i]== ' ' ||  (!(characters [i]>= 'a' && characters [i]<= 'z') && !(characters[i] >= 'A' && characters [i]<= 'Z')))
		    {
		        i++;
		        //j--;
		    }
		    else if(characters[j]==' ' || (!(characters [i]>= 'a' && characters [i]<= 'z') && !(characters[i] >= 'A' && characters [i]<= 'Z')))
		    {
		        j--;
		    }
		    else
		    {
		        temp = characters[i];
		        characters[i]= characters[j];
		        characters[j] = temp;
		        i++;
		        j--;
		    }
		    
		}
		reversedArray = new String(characters);
		System.out.println(reversedArray);
	}
}