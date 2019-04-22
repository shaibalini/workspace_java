import java.util.Scanner;
public class Search {
	int binarySearch(int l,int r,int n,int arr[]) {
		int mid=l+(r-l)/2;
	if(r>=l) {	
		if(arr[mid]==n) 
			return mid;
		if(arr[mid]>n) 
			return binarySearch(l,mid-1,n,arr);
		if(arr[mid]<n) 
			return binarySearch(mid+1,r,n,arr);
	}
		return -1;
		
	}
	public static void main(String args[]) {
		int arr[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=scanner.nextInt();}
		int n=scanner.nextInt();
		Search ob=new Search();
		int result=ob.binarySearch(0, 4, n, arr);
		
		if(result==-1)
		{
			System.out.println("element not found");
		}
		else
			System.out.println("Element found in "+ result +"th index");
		
	}
}
