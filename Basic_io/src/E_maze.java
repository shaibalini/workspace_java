import java.util.Scanner;
public class E_maze {
		public static void main(String args[]) {
			int x=0,y=0;
			String s;
			Scanner scanner=new Scanner(System.in);
			s=scanner.nextLine();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='L')
				{
					x--;
				}
				if(s.charAt(i)=='R')
				{
					x++;
				}
				if(s.charAt(i)=='D')
				{
					y--;
				}
				if(s.charAt(i)=='U')
				{
					y++;
				}
			}
			System.out.print("the coordinates are"+x+","+y);
			//System.out.print(y);
		}

}
