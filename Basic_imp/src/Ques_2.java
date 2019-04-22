import java.util.Scanner;
public class Ques_2 {
	public static void main(String args[])
	{
		int n,a,b,min=0,max=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		a=scanner.nextInt();
		b=scanner.nextInt();
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
					max=ar[j];
				}
			}
		}
		if(min>=a&&max<=b) {
			System.out.println("Yes");
		}
	}
}
