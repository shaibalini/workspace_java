import java.util.Scanner;
public class Anagrams {
	public static void main(String args[]) {
		String a,b,c=null,d=null;
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		b=sc.next();
		int n=0,sum=0;
		if(a.length()<b.length()) {
			n=a.length();
			c=String.valueOf(b);
			d=String.valueOf(a);
			
		}
		else if(a.length()>b.length()){
			n=b.length();
			c=String.valueOf(a);
			d=String.valueOf(b);
		}
		else if(a.length()==b.length()) {
			n=a.length();
			c=String.valueOf(a);
			d=String.valueOf(b);
			System.out.println(c);
		}
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=0;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<c.length();j++) {
				if(ar[i]!=1) {
					if(d.charAt(i)==c.charAt(j)) {
						ar[i]++;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			sum=sum+ar[i];
		}
		
		int result=c.length()-sum;
		System.out.println("The result is "+result);
		
	}
}
