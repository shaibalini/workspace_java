import java.util.Scanner;
public class Digit_prob {
	public static void main(String args[]) {
		int n,k;
		String x= null;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		k=scanner.nextInt();
		String s=Integer.toString(n);
		for(int i=0;i<k;i++) {
			s=s.replace(s.charAt(i), '9');
			
		}
		System.out.println(s);
	}
}
