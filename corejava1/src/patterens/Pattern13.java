//0   01  012 012301234

package patterens;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		for(row=0;row<5;row++)//outer loop for number of ows
		{
			for(int col=5-row;col>1;col--)//inner loop for spaces
			{
				
				System.out.print(" ");//print spaces
				
			}
			for(int col=0;col<=row;col++)//inner loop  for number of columns
			System.out.print(""+col);//print col
			}
		System.out.println();//ending line for each row

	}

}
