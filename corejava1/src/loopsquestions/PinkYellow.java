/*5) Write a program which prints 33 to 999. The numbers should be displayed as: 
i. For multiples of 3 print "PINK" instead of the number 

ii. For the multiples of five print "YELLOW". 

iii. For numbers which are multiples of both three and five print "PINK & YELLOW". 

Also print count of how many times “PINK” was printed, “YELLOW” was printed and “PINK & YELLOW “was printed. 

 * */


package loopsquestions;

public class PinkYellow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pcount=0;int ycount=0;int bothcount=0;
        for(int i=33;i<=999;i++)
        {
        if(i%3==0 && i%5==0)
            {
                System.out.println("yellow and pink");
                bothcount++;
            }
            else if(i%5==0)
                    {
                       System.out.println("yellow");  
                       ycount++;
                    }
            if(i%3==0)
            {
              System.out.println("pink");  
              pcount++;
            }
            else
            {
                System.out.println(i); 
            }
          
    }
        System.out.println("no of pinks are:"+pcount);
            System.out.println("no of yellows are:"+ycount);
            System.out.println("no of yellows and pinks are:"+bothcount);

	}

}
