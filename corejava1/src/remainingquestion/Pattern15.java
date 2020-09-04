//   1
//   212
//   32123
  // 4321234

 


package remainingquestion;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=1;i<=4;i++)
		{
			int n=4;
			for(int j=1;j<=n-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
