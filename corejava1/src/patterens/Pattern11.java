/*        *
 *        **
 *        ***
 *        ****
 *        ***
 *        **
 *        *
 */



package patterens;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		for(row=1;row<=4;row++)
		{
			for(int col=1;col<=row;col++)
			{
				
				System.out.print("*");
				
			}
			System.out.println();
			}
		for(row=1;row<=4;row++)
		{
			for(int col=4;col>=row;col--)
			{
				
				System.out.print("*");
				
			}
			System.out.println();
			}
	}

}
