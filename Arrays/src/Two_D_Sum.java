import java.util.Scanner;
public class Two_D_Sum {
	public static void main(String args[]) {

		int n=0,m=0;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		m=scanner.nextInt();
		int ar[][]=new int[n][m];
		int br[][]=new int[n][m];
		int sum[][]=new int[n][m];

		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ar[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				br[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum[i][j]=ar[i][j]+br[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
