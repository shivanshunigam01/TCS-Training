 import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter Your plain text:");
        str = sc.nextLine();
        System.out.println("Enter the key");
        int key = sc.nextInt();
        char ch[] = str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            if(ch[i] == ' ')
                System.out.print(" ");
            else{
                System.out.print((char)(ch[i]+key));
            }
        }
    }
}
