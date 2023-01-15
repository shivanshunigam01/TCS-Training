import java.util.*;

public class Maximum_index_differance
{

	 public static int Main()
	 {
	int n = 9;
	int[] arr = {34,8,10,3,2,80,30,33,1};

	ArrayList<Integer> v = new ArrayList<Integer>();

	for (int k = 0; k < n; k++)
	{
	int i = k;
	int j = n - 1;
	while (i < j)
	{
	  if (arr[i] < arr[j])   //i=0 && j=8
	  {
		   v.add(j - i);	//v.add(8)     1
	  }
	  j--;					//<<-- j=7
	}
	}
	int max = v.get(0); //1
	for (int i = 1; i < v.size(); i++)
	{
	  if (max < v.get(i))
	  {
		max = v.get(i);
	  }
	}
	  System.out.print(max);

	return 0;
	 }
	 public static void main(String[] args) {
		Maximum_index_differance ob1=new Maximum_index_differance();
		ob1.Main();
	 }
}