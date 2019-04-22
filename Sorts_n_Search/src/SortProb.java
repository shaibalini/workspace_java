import java.util.Scanner;
public class SortProb {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int  c, d, swap;
		   
		   
	    for (c = 0; c < ( n - 1 ); c++) {
	      for (d = 0; d < n - c - 1; d++) {
	        if (arr[d] > arr[d+1])
	        {
	          swap       = arr[d];
	          arr[d]   = arr[d+1];
	          arr[d+1] = swap;
	        }
	      }
	    }
	    
	    int m=sc.nextInt();
	    int sum1=0,sum2=0;
	    for(int i=0;i<n-m;i++) {
	    	sum1=sum1+arr[i];
	    }
	    for(int i=n-1;i>=m;i--) {
	    	sum2=sum2+arr[i];
	    }
	    System.out.println(sum1);
	    System.out.println(sum2);
	    int sub=0;
	    if(sum1>sum2) {
	    	sub=sum1-sum2;
	    }
	    if(sum1<sum2) {
	    	sub=sum2-sum1;
	    }
	    System.out.println(sub);
	}
}
