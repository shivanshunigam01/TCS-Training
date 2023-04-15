import java.util.Scanner;

public class vehicles {
   

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v= sc.nextInt();
		int w= sc.nextInt();
		int x=0;
		if(w <=2 || w%2!=0 || v>w){
		    System.out.println("INVALID INPUT");
		}
		else
		{
		     x = (4*v -w)/2;
		     System.out.println("TW =" + x +" FW = "+ (v-x) );
		}
		
	}
}

