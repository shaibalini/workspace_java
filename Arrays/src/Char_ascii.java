import java.util.Scanner;
import java.io.*;
public class Char_ascii {
	public static void main(String args[]) throws IOException{
		 Scanner sc=new Scanner(System.in);
		 InputStreamReader in=new InputStreamReader(System.in);
		 
		 BufferedReader r=new BufferedReader(in);
		 
		int n=0,m=0;
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				char c=sc.next().charAt(0);
				a[i][j]=c;
				
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println(sum);

}
	}

	
