import java.util.Scanner;
public class City_travel {
	public static void main(String args[]) {
		int dist=0,k=0,c=0,sum=0;
		Scanner scanner=new Scanner(System.in);
		dist=scanner.nextInt();
		k=scanner.nextInt();
		c=scanner.nextInt();
		int a[][]=new int[c][2];
		int b[]=new int[20];
		for(int i=0;i<20;i++) {
			b[i]=0;
		}
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<2;j++) {
				a[i][j]=scanner.nextInt();
				b[i]=a[i][j];
			}
		}
		
		
			for(int i=0;i<20;i++) {
				if(b[i]==0) {
					b[i]=k;
				}
			}
			int y=0,count=0;
			while(sum<dist)
			{
				sum=sum+b[y];
				y++;
				count++;
			}
		
		System.out.println(count);
	}
}
