import java.util.Scanner;
public class palindrome {
	public static void main(String args[]) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int x=0;
		System.out.println(s);
		int m=s.length()/2;
		for(int i=0;i<m;i++) {
			for(int j=s.length()-1;j>=m;j--) {
				if((i+j)==s.length()-1) {
			if(s.charAt(i)==s.charAt(j)) {
				x++;
			}}
			
		}
		}
		if(m==x) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
