import java.util.*;

public class Palindrome
{


	public static void expand(String str, int low, int high, auto set)
	{
		while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high))
		{
		set.insert(str.substring(low, high + 1));
		low--;
		high++;
		}
	}

	public static void findPalindromicSubstrings(String str)
	{
	  HashSet<String> set = new HashSet<String>();
	  for (int i = 0; i < str.length(); i++)
	  {
		expand(str, i, i, set);
		expand(str, i, i + 1, set);
	  }

//C++ TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
	  for (auto i : set)
	  {
		System.out.print(i);
		System.out.print("\n");
	  }
	}

	public static int Main()
	{
	  String str = "MALAYALAM";

	  findPalindromicSubstrings(str);

	  return 0;
	}
}