import java.util.Scanner;
public class String_op {
	public static void main(String args[])
	{
		String s;
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextLine();
		char ar[]=s.toCharArray();
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]);
		}
	}
}
