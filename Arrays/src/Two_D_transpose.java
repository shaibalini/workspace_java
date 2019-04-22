import java.util.Scanner;
public class Two_D_transpose {
	public static void main(String args[])
	{
		int n=0,m=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		m=scanner.nextInt();
		int ar[][]=new int[n][m];
		int br[][]=new int[n][m];

		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ar[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				br[j][i]=ar[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(br[i][j]+" ");
			}
			System.out.println();
		}
	}
}
