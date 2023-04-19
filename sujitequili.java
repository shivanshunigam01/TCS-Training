import java.util.Scanner;

public class sujitequili {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[20];
        System.out.println("enter the length");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
        a[i]=sc.nextInt();

       }

int sum=a[0];
int sum2=a[n-1];
int i=1,j=n-2;
       while(i<=j)
       {
      if(sum<sum2)
      {
        sum=sum+a[i];
        i++;
        //System.out.println(sum);

      }
      else  if(sum>sum2)
      {
        sum2=sum2+a[j];
        j--;
        //System.out.println(sum2);

      }
      else {

        sum=sum+a[i];
        sum2=sum2+a[j];
        i++;j--;
        //System.out.println(sum);
        //System.out.println(sum2);

      }

       }
       System.out.println(sum);
       System.out.println(i);
    }
    
}
