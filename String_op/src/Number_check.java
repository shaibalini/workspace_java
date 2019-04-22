import java.util.Scanner;
public class Number_check {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		char ch1[]=new char[3];
		char ch2[]=new char[3];
		ch1=s1.toCharArray();
		ch2=s2.toCharArray();
		int count=0;
		int i=0;
		while(i<s1.length()) {
			int j=0;
				while(j<s1.length())
			{
				if(ch1[i]==ch2[j])
				{
					count++;
				}
				j++;
			}
			if(count>=2) {
				System.out.println("YES");
				break;
			}
			
			count=0;
			i++;
		}
	}
}
