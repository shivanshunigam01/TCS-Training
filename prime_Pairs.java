import java.util.Scanner;

public class prime_Pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
       int i=n;
        for( ;i<=m;i++)
         {  int k=0;
        for(int j=2;j<10;j++)
        {
         if(i%j==0)
         {
            k++;
         }
         if(k<2)
         { int n1=0;
            int l=i+6;
            for(int m1=2;m1<10;m1++)
        {
         if(l%m1==0)
         {30

            n1++;
         }

         }
          if(n1<1)
          {
            System.out.println(i+" "+i+6);
          }
        }
        }
    }
    
    }
}
