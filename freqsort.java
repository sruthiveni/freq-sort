package mmmmm;
import java.util.*;
public class Freqsort {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int c1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int c=1;
			if(c1[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						c1[j]=-1;
					}
				}
				c1[i]=c;
			}
		}
		int s=n;
		while(s>0)
		{
			for(int i=0;i<n;i++)
				if(c1[i]==s)
					for(int j=0;j<s;j++)
						System.out.print(a[i]+" ");
			s--;
		}
	}
}
