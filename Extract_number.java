import java.util.Scanner;
  
public class Extract_number {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    int max=0;        
        //Extract digits from a String
        
        System.out.println("Enter a String");
        //prompting the user to enter a String
        String str = new String();
        str=sc.nextLine();
        
        System.out.println("The Entered String is "+str);
        
        for (char dig : str.toCharArray())
        {
            
            if (Character.isDigit(dig)) 
            {
                System.out.println("The digit found is "+dig); 
                
                if(max<dig-'0')    
              max=dig-'0';
        
            }
             
        }
        System.out.println(max);
    }
    
}
