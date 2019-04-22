import java.util.Scanner;
public class Monk_lucky {
	public static void main(String args[])
	{
		int n,min=0,count=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]<ar[j]) {
					min =ar[i];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]==min)
			{
				count++;
			}
		}
		if(count%2==0)
		{
			System.out.println("Unlucky");
		}
		else
		{
			System.out.println("Lucky");
		}
	}
}
