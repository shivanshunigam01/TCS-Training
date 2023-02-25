import java.util.Scanner;

public class swap_nibble {
 
     
        static int swapNibbles(int x)
        {
            return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
        }
         
        // Driver code 
        public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number two swap nibbles!");
            int x = sc.nextInt();

            System.out.print(swapNibbles(x));
        }
        
}
    
