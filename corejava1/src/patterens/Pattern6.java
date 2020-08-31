/*12345
2345
345
45
5
45
345
2345
12345*/

package patterens;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		for(row=1;row<=5;row++)
		{
			for(int col=row;col<=5;col++)
			{
				
				System.out.print( col  );
				
			}
			System.out.println();
			}
		for(row=4;row>=1;row--)
		{
			for(int col=row;col<=5;col++)
			{
				
				System.out.print( col  );
				
			}
			System.out.println();
	}


	}
}
