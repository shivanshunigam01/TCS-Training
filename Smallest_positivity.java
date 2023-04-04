
import java.util.*;
public class Smallest_positivity {

	static int solution(int[] A)
	{
		int n = A.length;
		
		int N = 1000010;

		
		boolean[] present = new boolean[N];

		int maxele = Integer.MIN_VALUE;

		
		for (int i = 0; i < n; i++) {

			
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;

			
			maxele = Math.max(maxele, A[i]);
		}

		
		for (int i = 1; i < N; i++)
			if (!present[i])
				return i;

		return maxele + 1;
	}

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
		int arr[] = new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

		System.out.println("The missing number is:"+solution(arr));
	}
}


