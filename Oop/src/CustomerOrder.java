import java.util.Scanner;
public class CustomerOrder {
	int na;
	public static void main(String args[]) {
		System.out.println("Enter your choice"
				+ "Enter 1 to Register the Customer"
				+ "Enter 2 to Display Products"
				+ "Enter 3 to Show Customer Details"
				+ "Enter 4 to Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Customer c[];
		switch(choice) {
		
		case 1:
			System.out.println("Enter total number of customers");
			int n=sc.nextInt();
			
			c=new Customer[n];
			for(int i=0;i<n;i++) {
				c[i]=new Customer();
			}
			for(int i=0;i<n;i++) {
				c[i] = new Customer();
				System.out.println("Enter the Customer Id");
				c[i].setCustomerId(sc.nextInt());
				System.out.println("Enter the Customer Name");
				c[i].setCustomerName(sc.next());
				System.out.println("Enter the Contact Number");
				c[i].setContact(sc.nextLong());
				System.out.println("Enter the Customer email Id");
				c[i].setEmail(sc.next());
				
			}
			
			
			break;
		case 2:
			Products p[]=new Products[5];
			for(int i=0;i<5;i++) {
				p[i]=new Products();
			}
			p[0].setProductId(1);
			p[0].setProductName("Milk");
			p[0].setProductCost(10);
			
			p[1].setProductId(2);
			p[1].setProductName("Curd");
			p[1].setProductCost(5);
			
			p[2].setProductId(3);
			p[2].setProductName("Paneer");
			p[2].setProductCost(20);
			
			p[3].setProductId(4);
			p[3].setProductName("Khoa");
			p[3].setProductCost(15);
			
			p[4].setProductId(5);
			p[4].setProductName("Lassi");
			p[4].setProductCost(10);
			
			for(int i=0;i<p.length;i++) {
				System.out.println(p[i].getProductId());
				System.out.println(p[i].getProductName());
				System.out.println(p[i].getProductCost());
				
			}
			break;
		case 3:
			System.out.println("Enter Customer ID");
			int id=sc.nextInt();
			for(int i=0;i<c.length;i++) {
				c[i]=new Customer();
			}
			c[id].getCustomerId();
			c[id].getCustomerName();
			c[id].getContact();
			c[id].getEmail();
			break;
		case 4:
			break;
			
		}
	}
}
