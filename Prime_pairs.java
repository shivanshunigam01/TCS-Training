import java.util.*;

public class Prime_pairs
{

	 public static int prime()
	 {

	  int n = 10;
	  int m = 20;
	  ArrayList<Integer> v = new ArrayList<Integer>();
	  for (n=10; n <= m; n++)
	  {
		int j = 2;
		for (j=2; j < n; j++)
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
	public static void main(String[] args) {
		Prime_pairs ob1=new Prime_pairs();
		ob1.prime();
	}


	 }
