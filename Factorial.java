import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++){
        fact=i*fact;

    }
    System.out.println(fact);
    
    }

}
