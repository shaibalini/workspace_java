import java.util.Scanner;
public class Idempotent {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[][]=new int[n][n];
		System.out.println("Enter 2-D array to check");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=0;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int l=0;l<n;l++) {
					c[i][j]+=a[i][l]*a[l][j];
				}
			}
		}
		
		//checking idempotence
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(c[i][j]==a[i][j]) {
					flag++;
				}
				else 
					break;
			}
		}
		if(flag==n*n) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}
