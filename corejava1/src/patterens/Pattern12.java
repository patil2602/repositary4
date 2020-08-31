/*1
  10
  101
  1010
  10101


*/
package patterens;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		for(row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				int rem=col%2;
				
				System.out.print(+rem);
				
			}
			System.out.println();
			}

	}

}
