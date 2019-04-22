import java.io.*;
public class WordCheck {
	public static void main(String args[]) throws IOException{
		InputStreamReader in=new InputStreamReader(System.in);
		 
		 BufferedReader r=new BufferedReader(in);
		 String s=r.readLine();
		 //String s="minftrrd aeiou aeiouyt";
		 String[] words = s.split(" ");
		 String s2=r.readLine();
		 int count=0;
		 for(int i=0;i<words.length;i++) {
			 if(words[i].length()==s2.length()) {
			 for(int j=0;j<s2.length();j++) {
				 if(s2.charAt(j)==words[i].charAt(j)) {
					 count++;
				 }
				 else 
					 break;
			 }
			 }
		 }
		 if(count==s2.length()) {
			 System.out.println("Yes");
		 }
		 else
			 System.out.println("No");
	}
}
