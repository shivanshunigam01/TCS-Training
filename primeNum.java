import java.util.Scanner;

public class primeNum {

    public static boolean isPrime(int n){
        boolean flag=false;

for(int i=2;i<=Math.sqrt(n);i++){
    if(i%n==0){
        flag=false;
    }
}
    return true;
    }
    
    public static void main(String[] args) {
        
         System.out.println(isPrime(16));

    }
}
