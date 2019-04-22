import java.util.Scanner;
public class String_sum {
	public static void main(String args[]) {
		String s;
		int x;
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++) {
			x=s.charAt(i)-96;
			sum=sum+x;
		}
		System.out.println(sum);
	}
}
