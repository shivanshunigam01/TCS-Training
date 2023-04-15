import java.util.Scanner;

public class Starthash {
    public static int  hash(String str) {
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='#'){
                c++; // no of hash
            }
        }
        
    return c;
    }        

        
    public static int star(String str) {
        int cstart=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='*'){
                cstart++; // no of hash
            }
        }
        return cstart;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hash and star");
        String str=sc.nextLine();
        if(hash(str)==star(str)){
            System.out.println("both are equal");
        }
        
        if(hash(str)<star(str)){
            System.out.println("negative");
        }
        if(hash(str)>star(str)){
            System.out.println("positive");
        }
    }
}
