import java.util.Scanner;
public class Array_Sum {
	public static void main(String args[])
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextLong();
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
