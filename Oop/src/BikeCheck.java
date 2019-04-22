import java.util.Scanner;
public class BikeCheck {
	
	
	Bike[] insertionSort(Bike[] b) {
		int c,d;
		  Bike t;
		 
		  for ( c = 1 ; c <= b.length - 1; c++) {
		    d = c;
		 
		    while ( d > 0 && b[d-1].getBikeNo() > b[d].getBikeNo()) {
		      t          = b[d];
		      b[d]   = b[d-1];
		      b[d-1] = t;
		 
		      d--;
		    }
		  }
		  for (c = 0; c <= b.length - 1; c++) {
			  b[c].getBikeNo();
				b[c].getBikeName();
				b[c].getManufac();
			  }
		  return b;
			  }
			  
	int binarySearch(int l,int r,int bn,Bike b[]) {
		int mid=l+(r-l)/2;
		int sum=0;
		int flag=0;
	if(r>l) {	
		if(b[mid].getBikeNo()==bn) {
			flag=1;
			return flag;}
		if(b[mid].getBikeNo()>bn) 
			 binarySearch(l,mid-1,bn,b);
		if(b[mid].getBikeNo()<bn) 
			 binarySearch(mid+1,r,bn,b);
	}
	else {
		flag=0;
		return flag;
	}
	return -1;
	}
	
	Bike[] Sort(Bike[] b,int total) {
		Bike temp;
		int j;
        boolean flag = true;  // will determine when the sort is finished
        

        while ( flag )
        {
           flag = false;
           for (j = 0; j < b.length - 1;  j++ )
              {
               if ( b [ j ].getManufac().getManufacName().compareToIgnoreCase( b[ j+1 ].getManufac().getManufacName() ) > 0 )
                 {                                             // ascending sort
                      temp = b[ j ];
                      b [ j ] = b [ j+1];     // swapping
                      b [ j+1] = temp; 
                      flag = true;
                       } 
               } 
        } 
		return b;
	}
	public static void main(String args[]) {
		System.out.println("Eneter the number of bikes you want to enter");
		Scanner sc=new Scanner(System.in);
		int total= sc.nextInt();
		Bike b[]=new Bike[total];
		
		
		for(int i=0;i<total;i++) {
			b[i]=new Bike();
		}
		System.out.println("What kind of injection do u want to make"
				+ "press 0 for setter"
				+ "press 1 for constructor type");
		int choice=sc.nextInt();
		switch(choice) {
		case 0:
			for(int i=0;i<total;i++) {
				int bikeNo=sc.nextInt();
				String bikeName=sc.next();
				int manuId=sc.nextInt();
				String manuName=sc.next();
				
				Manufacturer m=new Manufacturer(manuId,manuName);
				b[i] = new Bike(bikeNo,bikeName,m);
			}
			break;
		case 1:
			for(int i=0;i<total;i++) {
				b[i] = new Bike();
				Manufacturer m=new Manufacturer();
				System.out.println("Enter the  Bike no");
				b[i].setBikeNo(sc.nextInt());
				System.out.println("Enter the Bike Name");
				b[i].setBikeName(sc.next());
				System.out.println("Enter the manufacturer ID");
				m.setManufacID(sc.nextInt());
				System.out.println("Enter manufacturer name");
				m.setManufacName(sc.next());
				b[i].setManufac(m);
				
				
			}
			break;
		}
		
	/*	
		b[0].setBikeNo(5);
		b[0].setBikeName("Superlow");
		b[0].setManufac("Harley");
		
		b[1].setBikeNo(2);
		b[1].setBikeName("Forty-Eight");
		b[1].setManufac("Harley");
		
		b[2].setBikeNo(1);
		b[2].setBikeName("1200 Custom");
		b[2].setManufac("Harley");
		
		b[3].setBikeNo(4);
		b[3].setBikeName("Roadster");
		b[3].setManufac("Harley");
		
		b[4].setBikeNo(3);
		b[4].setBikeName("Iron 883");
		b[4].setManufac("Harley");
		*/
		BikeCheck ob=new BikeCheck();
		
		b=ob.Sort(b,total);
		
		for(int i=0;i<total;i++) {
			System.out.print(b[i].getBikeNo());
			System.out.print(" ");
			System.out.print(b[i].getBikeName());
			System.out.print(" ");
			System.out.print(b[i].getManufac().getManufacID());
			System.out.print(" ");
			System.out.print(b[i].getManufac().getManufacName());
			System.out.println();
		}
		b=ob.insertionSort(b);
		for(int i=0;i<total;i++) {
			System.out.print(b[i].getBikeNo());
			System.out.print(" ");
			System.out.print(b[i].getBikeName());
			System.out.print(" ");
			System.out.print(b[i].getManufac().getManufacID());
			System.out.print(" ");
			System.out.print(b[i].getManufac().getManufacName());
			System.out.println();
		}
		System.out.println("Enter the bike number to search");
		int bn=sc.nextInt();
	
		int flag=ob.binarySearch(0, total, bn, b);
		if(flag==1) {
			System.out.print("Its present");
		}
		else if(flag==0) {
			System.out.println("Not Present");
		}
}
}
