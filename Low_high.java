public class Low_high
{
	public static void main(String[] args) {
		
	
	

		int x = 4;
		int y = 5;
		int k = 3;
		int sum = 0;
		int count = 0;
		int noofleter = 0;
		for (int i = x; i <= y; i++)
		{
			noofleter++; //2
		}

		int noofP = noofleter;
		for (int i = x; i <= y; i++)
		{
			sum = 0;
			for (int j = i; j <= y; j++)
			{
				sum = i + j;
				if (sum % 2 == 0)
				{
					System.out.println(sum+"");
					count++;
				}
			}
		}
		if (count % 2 == 0)
		{
			System.out.print(" number of digits ");
			System.out.print(count);
		}
		else
		{
			System.out.print("404 error");
		}
	}
}