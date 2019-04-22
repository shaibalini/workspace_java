import java.util.Scanner;
public class Signal_range {
	public static void main(String args[])
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int a[]=new int[n];
		int r[]=new int[n];
		for(int i=0;i<n;i++)
		{
			r[i]=1;
		}
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
		}
		for(int i=n-1;i>-1;i--)
		{
			for(int j=i-1;j>-1;j--)
			{
				if(a[i]>a[j])
				{
					r[i]++;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(r[i] + " ");
		}
	}
}
