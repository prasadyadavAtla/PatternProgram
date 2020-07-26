package pattern;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*\
		 *1234
		 *2341
		 *3412
		 *4123
		 */
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=4;j++)
			{
				int k=i+j-1;

				if(k>4)
				{
					k=k-4;
					
				}
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
