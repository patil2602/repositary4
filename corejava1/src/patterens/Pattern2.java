/*54321
  5432
  543 
  54
  5*/

package patterens;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		for(row=1;row<=5;row++)
		{
			for(int col=5;col>=row;col--)
			{
				
				System.out.print(col);
				
			}
			System.out.println();
			}

	}

}
