/*1
 * 21
 * 321
 * 4321
 * 54321
 */

package patterens;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		for(row=1;row<=5;row++)
		{
			for(int col=row;col>=1;col--)
			{
				
				System.out.print(col);
				
			}
			System.out.println();
			}


	}

}
