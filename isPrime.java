import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("Enter the num you want to check:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                flag=true;
            }

        }
        if(!flag){
            System.out.println("not a prime number:");
        }
        else{
            System.out.println("Prime number:");
        }
    }
    }
