import java.util.Scanner;
 
class Sort  {
  void bubbleSort(int n,int array[]) {
    int  c, d, swap;
   
   
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1])
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    for (c = 0; c < n; c++) {
      System.out.print(array[c]);
    System.out.print(" ");
    }
  }
  void insertionSort(int n,int array[] ) {
	  int c,d,t;
	  
		 
		  for ( c = 1 ; c <= n - 1; c++) {
		    d = c;
		 
		    while ( d > 0 && array[d-1] > array[d]) {
		      t          = array[d];
		      array[d]   = array[d-1];
		      array[d-1] = t;
		 
		      d--;
		    }
		  }
		  for (c = 0; c <= n - 1; c++) {
			    System.out.print(array[c]);
			    System.out.print(" ");
			  }
  }
  public static void main(String args[]) {
	  Sort s1=new Sort();
	  int n,c;
	  Scanner in = new Scanner(System.in);
	  
	    n = in.nextInt();
	 
	    int array[] = new int[n];
	 
	 
	    for (c = 0; c < n; c++)
	      array[c] = in.nextInt();
	    int k;
	    System.out.println("Press 1 for Bubble Sort"
	    		+"     " + "Press 2 for Insertion Sort");
	    k=in.nextInt();
	    
	    switch(k) {
	    case 1:
	    	 s1.bubbleSort(n,array);
	    	 break;
	    case 2:
	    	s1.insertionSort(n, array);
	    	break;
	    }
  }
}