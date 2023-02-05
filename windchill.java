import java.util.*;
import java.lang.Math.*;

public class windchill {
    // You are using Java


    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        int velo=sc.nextInt();
        float factor;
        
        factor=35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        
        
        System.out.println(factor);
}
}
