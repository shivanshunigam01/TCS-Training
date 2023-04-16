import java.util.Scanner;

public class greaterArray {
    public static void  Greater(int array[],int size) {
        int count=0;
    for (int i = 0; i < size; i++) {
        if(array[i]>array[i+1]){
            count++;
            // i++;
        }
        else{
            i++;
        }
        
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size =sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        
    }
}
