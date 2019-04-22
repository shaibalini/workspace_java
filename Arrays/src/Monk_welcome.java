import java.util.Scanner;

public class Monk_welcome {
	public static void main(String args[]) {
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int ar[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=scanner.nextInt();
		}
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=ar[i]+b[i];
			System.out.print(c[i] + " ");
		}
	}
}
