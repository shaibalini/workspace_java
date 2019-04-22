import java.util.Scanner;

public class SwapDia {
	boolean check(int sum) {
		if (sum % 2 == 0) {
			return true;
		} else
			return false;
	}

	int swaps(int ar[][], int br[][], int n, int m, int l, int k) {
		if ((n == l) && (m == k) && (n == k)) {
			int swap;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						swap = ar[i][j];
						ar[i][j] = br[i][j];
						br[i][j] = swap;
					}
				}
			}
			System.out.println("Swapped matrices are:::");
			System.out.println("First:::");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(ar[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println("Second:::");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(br[i][j]);
					System.out.print(" ");
				}
				System.out.println();
			}

		} else {
			System.out.println("Matrix are not of n*n type");
			return 0;}

		int sum = 0;

		for (int j = 0; j < n; j++) {
			int i = n - 1;
			sum += ar[i][j] * br[i][j];
		}
		checkAnglo(sum);
		
		System.out.println("The sum is " + sum);
		SwapDia ob=new SwapDia();
		boolean ch = ob.check(sum);
		System.out.println(ch);
		return 0;

	}

	void checkAnglo(int sum) {

		int n = sum;
		int q = 0;
		int r = 0;
		int digi = 0;
		while (digi > 9) {
			while (n > 9) {
				q = n / 10;
				r = n % 10;
				digi = digi + r;
				n = q;
			}
		}
		int ang = digi % 5;
		if (ang == 1) {
			System.out.println("Anglo");
		} else
			System.out.println("Not anglo");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix 1");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println("Enter the order of the matrix 2");
		int l = sc.nextInt();
		int k = sc.nextInt();
		
		if((n==m)&&(l==k)&&(n==l)) {
		int ar[][] = new int[n][m];
		System.out.println("Enter the elements of first matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ar[i][j] = sc.nextInt();
			}
		}

		
		int br[][] = new int[l][k];
		System.out.println("Enter the elements of Second matrix");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < k; j++) {
				br[i][j] = sc.nextInt();
			}
		}
		
		SwapDia ob = new SwapDia();
		ob.swaps(ar, br, n, m, l, k);
		}
		else
			System.out.println("Not a n*n matrix");
	}
}
