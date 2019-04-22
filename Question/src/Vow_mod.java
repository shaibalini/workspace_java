import java.io.*;
public class Vow_mod {
	int vow_check(String s1) {
		int v[]=new int[5];
		for(int i=0;i<5;i++) {
			 v[i]=0;
		 }
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a') {
				v[0]++;
			}
			else if(s1.charAt(i)=='e') {
				v[1]++;
			}
			else if(s1.charAt(i)=='i') {
				v[2]++;
			}
			else if(s1.charAt(i)=='o') {
				v[3]++;
			}
			else if(s1.charAt(i)=='u') {
				v[4]++;
			}
		}
		if((v[0]>=1)&&(v[1]>=1)&&(v[2]>=1)&&(v[3]>=1)&&(v[4]>=1))
		{
			return 1;
		}
		else
			return 0;
	}
	public static void main(String args[]) throws IOException{
		InputStreamReader in=new InputStreamReader(System.in);
		 
		 BufferedReader r=new BufferedReader(in);
		 String s=r.readLine();
		 //String s="minftrrd aeiou aeiouyt";
		 String[] words = s.split(" ");

		 int count[]=new int[words.length];
		 for(int i=0;i<words.length;i++) {
			 count[i]=0;
		 }
		 int a[]=new int[words.length];
		 int k=0;
		 Vow_mod ob=new Vow_mod();
		 for(int i=0;i<words.length;i++) {
			 a[k]=ob.vow_check(words[i]);
			 k++;
		 }
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==1) {
				 System.out.println(words[i]);
			 }
		 }
	}
}
