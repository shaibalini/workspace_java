import java.io.*;
public class Vow {
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
		 for(int i=0;i<words.length;i++) {
			 for(int j=0;j<words[i].length();j++) {
				 if(words[i].charAt(j)=='a') {
					 count[i]++;
				 }
				 else if(words[i].charAt(j)=='e') {
					 count[i]++;
				 }
				 else if(words[i].charAt(j)=='i') {
					 count[i]++;
				 }
				 else if(words[i].charAt(j)=='o') {
					 count[i]++;
				 }
				 else if(words[i].charAt(j)=='u') {
					 count[i]++;
				 }
			 }
		 }
		 
		 
		
		 int max=count[0];
		 int flag=-1;
		 int a=-1,b=-1;
		 
		 for(int i=0;i<count.length;i++)
		 {
			 
				 if(count[i]>max) {
					 max=count[i];
					  flag =i;
				 
			 }
				 else {
					 max=count[0];
					 flag=0;
				 }
		 }
		 
		 for(int i=0;i<count.length;i++) {
			 for(int j=0;j<count.length;j++) {
				 if(i!=j) {
				 if((count[i]==count[j])&&(count[i]==max)) {
					  a=words[i].length();
					  b=words[j].length();
					  
					  if(a<b) {
						  flag=i;
					  }
					  else
						  flag=j;
				 }
			 }
			 }
		 }
		 
		 System.out.println(words[flag]);
		 

	}
}
