import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int large[][] = new int[m][m];
		int small[][] = new int[n][n];
		//boolean match = true;
		boolean isPresent = false;
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        large[i][j] = sc.nextInt();
		    }
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        small[i][j] = sc.nextInt();
		    }
		}
		int top_left = small[0][0];
		for(int i=0;i<m-n;i++)
		{
		    for(int j=0;j<m-n;j++)
		    {
		        boolean match =true;
		        for(int k=0;k<n;k++)
		            {
		                for(int l=0;l<n;l++)
		                {
		                    if(large[i+k][j+l]!=small[k][l])
		                    {
		                        match=false;
		                        break;
		                    }
		                }
		                if(!match)
		                {
		                    break;
		                }
		            }
		            
		        if (match) {
                    isPresent = true;
                    break;
                }
            }
            if (isPresent) break;
        }
		
		System.out.print(isPresent);
	}
}
