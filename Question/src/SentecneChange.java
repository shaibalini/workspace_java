import java.util.Scanner;
import java.io.*;
public class SentecneChange {
	char[] swaps(String s) {
		
		 char ar[]=s.toCharArray();
		 char br[]=new char[ar.length];
		 
		 int k=0;
		 
		 for(int i=ar.length-1;i>=0;i--) {
			 br[k]=ar[i];
			 k++;
		 }
		 return br;
	}
	void changeCase(char br[]) {
		for(int i=0;i<br.length;i=i+2) {
			 if(br[i]!=' ') {
			 if(br[i]<97) {
				 br[i]=(char)(br[i]+32);
			 }
			 }
		 }
		 for(int i=1;i<br.length;i=i+2) {
			 if(br[i]!=' ') {
			 if(br[i]>90) {
				 br[i]=(char)(br[i]-32);
			 }
			 }
		 }
		 String str=new String(br);
		 System.out.println(str);
	}
	public static void main(String args[]) throws IOException{
		InputStreamReader in=new InputStreamReader(System.in);
		 
		 BufferedReader r=new BufferedReader(in);
		String s=r.readLine();
		 SentecneChange ob=new SentecneChange();
		 char br[]=ob.swaps(s);
		 ob.changeCase(br);
		 
		 
	}
}
