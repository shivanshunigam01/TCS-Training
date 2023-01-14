import java.util.*;
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r1= sc.nextInt();
        int r2=sc.nextInt(); int k=0;
       int k1,k2;
        for(int i=r1;i<=r2;i++){
            int j=i;
            
               k1=j%10;
               j=j/10;
               k2=j%10;
               
               if(k1==k2){
                k--;

               }
                k++;
                
            
        }
        System.out.println(k);
        
    }
}
