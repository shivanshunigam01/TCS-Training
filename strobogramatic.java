public class strobogramatic {

    
        public static void main(String[] args) {
            int a;
            a=1991;
            int l=a;
            int sum=0;
            while(a>0)
            {
            sum=sum*10+a%10;
            a=a/10;
            
            }
            int k=0;
             while(sum>0)
            {
                int j=sum%10;
                sum=sum/10;
             if(j==1||j==8||j==0||j==9||j==6)
             {
                 
                 
                 if(j==6)
                 {   j=9;
                 }
                 if(j==9)
                 {   j=6; }
                 
                 System.out.println(j);
                 k=k*10+j;
                 
               System.out.println(k);
                 
                 }
                 
             
             else
             {
                 break;
             }
            
            }
        
            if(l==k)
            {
            System.out.println("yes" +k);
            }
            else
                System.out.println(""+k);
        }
    }


