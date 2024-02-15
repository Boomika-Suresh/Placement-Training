public class Main
{
	public static void main(String[] args) {
	    int[] A = {1,2,1,5,3};
	    int[] B = {5,8,7,9};
	    
		int n;
		long complement,rem;
		n=A.length>B.length?A.length:B.length;
		int[] result1 = new int[n];
		int[] result2 = new int[n];
		complement = (long)Math.pow(10,n)-1;
		//System.out.println(complement);
		int[] complement_array = new int[n];
		for(int i=n-1;i>=0;i--)
		{
		    complement_array[i]=(int) complement%10;
		    complement=complement/10;
		}
		int complement_element,B_element;
		for(int i=0;i<n;i++)
		{
		    complement_element= complement_array[n-i-1];
		    if(i<B.length)
		    {
		        B_element = B[B.length-i-1];
		    }
		    else{
		        B_element = 0;
		    }
		    result1[n-i-1] = complement_element - B_element;
		    result2[n-i-1] = result1[n-i-1]+A[n-i-1];
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(result2[i]);
		}

}
}