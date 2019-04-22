import java.util.Scanner;
public class MainClass {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of entries u want to make");
		int n=sc.nextInt();
		int m=0;
		CollegeClass c[]=new CollegeClass[n];
		
		for(int i=0;i<n;i++) {
			c[i]=new CollegeClass();
			System.out.println("Enter id");
			c[i].setClassID(sc.nextInt());
			System.out.println("Enter class name");
			c[i].setClassName(sc.next());
			Department dob=new Department();
			System.out.println("Enter Department id");
			dob.setDepID(sc.nextInt());
			System.out.println("Enter Department Name");
			dob.setDeptName(sc.next());
			
			System.out.println("Enter the number of faculties in the dept.");
			m=sc.nextInt();
			Faculty f[]=new Faculty[m];
			
			for(int j=0;j<m;j++) {
				f[j]=new Faculty();
				System.out.println("Enter Faculty id");
				f[j].setFid(sc.nextInt());
				System.out.println("Enter the Faculty Name");
				f[j].setFname(sc.next());
				System.out.println("Enter Faculty Age");
				f[j].setAge(sc.nextInt());
				
			}
			dob.setF(f);
			c[i].setDept(dob);
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(c[i].getClassID());
			System.out.print(" ");
			System.out.print(c[i].getClassName());
			System.out.print(" ");
			System.out.print(c[i].getDept().getDepID());
			System.out.print(" ");
			System.out.print(c[i].getDept().getDeptName());
			System.out.println();
			Faculty ar[]=c[i].getDept().getF();
			for(int j=0;j<ar.length;j++) {
				
				System.out.println(ar[j].getFid());
				System.out.println(ar[j].getFname());
				System.out.println(ar[j].getAge());
			}
			
			
		}
	}
}
