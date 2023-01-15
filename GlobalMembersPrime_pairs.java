import java.util.*;

public class GlobalMembersPrime_pairs
{

	 public static int Main()
	 {

	  int n = 10;
	  int m = 20;
	  ArrayList<Integer> v = new ArrayList<Integer>();
	  for (n; n <= m; n++)
	  {
		int j = 2;
		for (j; j < n; j++)
		{
		  if (n % j == 0)
		  {
			break;
		  }
		}
		  if (j == n)
		  {
			v.add(n);
		  }
	  }

	  for (int i = 0; i < v.size(); i++)
	  {
		for (int j = i + 1; j < v.size(); j++)
		{
		  if (v.get(i) + 6 == v.get(j))
		  {
			System.out.print("(");
			System.out.print(v.get(i));
			System.out.print(" ");
			System.out.print(v.get(j));
			System.out.print(")");
			System.out.print("\n");
		  }
		}
	  }


	return 0;
	 }
}