import java.util.Scanner;
public class Count_number {
	public static void main(String args[])
	{
		int n=0;
		String s;
		String s1=null;
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextLine();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=9;j++) {
				 s1=Integer.toString(j);
				if(s.charAt(i)==s1.charAt(0)) {
					n++;
			}
			}
		}
		System.out.println(n);
	}
}
