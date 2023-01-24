import java.util.Scanner;
public class eulers {
    static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int b= sc.nextInt();
        System.out.println("GCD Pairs are: ");
        for(int a=1;a<b;a++){
            if((gcd(a,b)==1))
            {
                count++;
                System.out.println("("+a+","+b+")");
            }
        }
        System.out.println("No. of Possible Pairs = " +count);

    } 
}