package Pattern;

public class Demo15 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=5;i++) //for rows
		{
			for(int j=5;j>i;j--) //for columns
			{
				System.out.print(" "+n);

			}
			n--;
			System.out.println();
		}

	}

}
