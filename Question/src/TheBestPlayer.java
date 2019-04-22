import java.util.Scanner;

public class TheBestPlayer {
	void insertionSort(int n,int k[],String s[] ,int m) {
		  int c,d,t;
		  String ts=null;
			 
			  for ( c = 1 ; c <= n - 1; c++) {
			    d = c;
			 
			    while ( d > 0 && k[d-1] > k[d]) {
			      t          = k[d];
			      k[d]   = k[d-1];
			      k[d-1] = t;
			 
			      ts         = s[d];
			      s[d]   = s[d-1];
			      s[d-1] = ts;
			      d--;
			    }
			  }
			  for(int i=n-1;i>n-m-1;i--) {
			    	System.out.println(s[i]);
	}
	}
public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		String s[]=new String[n];
		int k[]=new int[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
			k[i]=sc.nextInt();
		}
		TheBestPlayer ob=new TheBestPlayer();
		ob.insertionSort(n,k,s,m);
		/*int  c, d, swap;
		  String swaps=null; 
		   
	    for (c = 0; c < ( n - 1 ); c++) {
	      for (d = 0; d < n - c - 1; d++) {
	        if (k[d] > k[d+1])
	        {
	          swap       = k[d];
	          k[d]   = k[d+1];
	          k[d+1] = swap;
	          
	          swaps=s[d];
	          s[d]=s[d+1];
	          s[d+1]=swaps;
	        }
	      }
	    }
	    */
	    
	    
	}
}
