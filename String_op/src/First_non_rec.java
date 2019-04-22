import java.util.Scanner;
public class First_non_rec {
	int x=0;
	float f=0.5f;
	public static void main(String args[]){
		int flag=0;
		int x=0;
		String s1,s2;
		
		Scanner scanner=new Scanner(System.in);
		s1=scanner.nextLine();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s1.toCharArray();
		
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
			if(count==1) {
				System.out.println(ch1[i]);
				break;
			}
			count=0;
			i++;
		}
		//System.out.println(s);
}
}
