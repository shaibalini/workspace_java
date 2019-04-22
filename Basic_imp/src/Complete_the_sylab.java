import java.util.Scanner;
public class Complete_the_sylab {
	public static void main(String args[])
	{
		String s;
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextLine();
		int a=-1;
		for(int i=0;i<s.length();i++)
		{
			
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1') {
				a=i;
			}
		}
		if(a==0) {
			System.out.println("Monday");
			
		}
		else if(a==1) {
			System.out.println("Tuesday");
			
		}
		else if(a==2) {
			System.out.println("Wednesday");
			
		}
		else if(a==3) {
			System.out.println("Thursday");
			
		}
		else if(a==4) {
			System.out.println("Friday");
			
		}
		else if(a==5) {
			System.out.println("Saturday");
			
		}
		else if(a==6) {
			System.out.println("Sunday");
			
		}
	}
}
