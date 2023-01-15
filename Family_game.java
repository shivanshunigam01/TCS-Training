public class Family_game {
    public static void main(String[]args)
    {
        int n=3;
        Boolean b[]=new Boolean[n];
        char ch[]={'x','y','x'};
        int i=0,j=0;
        while(i<n)
        {                             
            b[i]=true;                          //--------Set all the player true 
            i++;       
        }
        while(n!=1)
        {
            
            for( i=0;n>1;)   //Alternative for(i=0;i<b.length()&&n!==1)
            {
                if(b[i]==true)
                {
                    if(ch[j]=='y')
                    {
                        b[i]=false;
                        n--;
                        j++;
                    }
                    else{
                        j++;
                    }

                }
                i++;
                if(i>=b.length)
                {
                    i=0;
                }
                if(j==ch.length)
                {
                    j=0;
                }
            }
        }
        for(int a=0;a<b.length;a++)
        {
            if(b[a]==true)
            {
                System.out.println(a+1);
                break;
            }
        }
    }
}