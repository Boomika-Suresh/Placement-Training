public class Main
{
	public static void main(String[] args) {
		int sum=0,i,j,subset_sum=0;
		double subset_average = 0;
		int nums[] = {10,20,30,40,50,60};
		for(i=0;i<nums.length;i++)
		{
		    sum+=nums[i];
		}
		double average = sum / nums.length;
		//System.out.print(average);
		
		//Calculating subset average
		for(i=0;i<nums.length;i++)
		{
		    for(j=i+1;j<nums.length;j++)
		    {
		       subset_sum = nums[i] + nums[j];
		       subset_average = subset_sum/2;
		       if(subset_average == average)
		       {
		           System.out.println("["+nums[i]+","+nums[j]+"]");
		       }
		       else
		       {
		           subset_sum = nums[i];
		       }
		       
		    }
		}
	}
}