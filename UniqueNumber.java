import java.util.*;
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r1= sc.nextInt();
        int r2=sc.nextInt(); 
        int k=0;
       int k1,k2=99,k3=51;
       int f1;
        for(int i=r1;i<=r2;i++){
           int f=i;
           
            while(f>0){
                
                k1=f%10;
                f=f/10;
            
                if(k2!=k1){
                    k2=f%10;
                    f=f/10;
                    if(k2==k1)
                    break;
                    else if(f==0)
                    System.out.println(i);
                }
                
                else {
                  break;
                    //
                }


}

        }
    }
}    
