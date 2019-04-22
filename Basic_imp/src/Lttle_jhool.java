import java.util.Scanner; 
class Lttle_jhool
{ 
    public static void main(String args[]) 
    { 
        Scanner sr=new Scanner(System.in); 
        String s = sr.nextLine(); 
        int count_a=0,count_b=0;
        while(count_a!=6 && count_b!=6)
        {
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='0')
        	{
        		count_a++;
        		count_b=0;
        	}
        	if(s.charAt(i)=='1')
        	{
        		count_b++;
        		count_a=0;
        	}
        }
        }
        if(count_a==6||count_b==6)
        {
        	System.out.println("Sorry Sorry!");
        }
        else
        {
        	System.out.println("Good Luck");
        }
    } 
} 