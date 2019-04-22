import java.util.Scanner;
public class Print_hack {
	public static void main(String args[]) {
		int count=0;
		String s;
		Scanner scanner= new Scanner(System.in);
		s=scanner.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='h') {
				count++;
				break;
			}
			if(s.charAt(i)=='a') {
				count++;
				break;
			}
			if(s.charAt(i)=='c') {
				count++;
				break;
			}
			if(s.charAt(i)=='k') {
				count++;
				break;
			}
			if(s.charAt(i)=='e') {
				count++;
				break;
			}
			if(s.charAt(i)=='r') {
				count++;
				break;
			}
			if(s.charAt(i)=='t') {
				count++;
				break;
			}
			}
		System.out.println(count%11);
		}
	}
	

