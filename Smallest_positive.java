import java.util.Scanner;
import java.util.*;

public class Smallest_positive {
    public class SmallestPositiveInteger {
        // Function to find the smallest positive missing integer
        static int findSmallestPositiveMissingInteger(int[] array){
            Arrays.sort(array);
            int j,i = 1;
            for(j = 0; j<array.length; j++){
               if(array[j] == i){
                  i++;
               }
            } 
            return i;
        }
        // Function to read input and display the output
        public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
            int size;
            System.out.println("Enter the size of the array");
            try {
                size = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input");
                return;
            }
            int[] array = new int[size];
            System.out.println("Enter array elements");
            int i;
            for (i = 0; i < array.length; i++) {
                try {
                    array[i] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("An error occurred");
                    return;
                }
            }
            int missing = findSmallestPositiveMissingInteger(array);
            System.out.println("The smallest positive integer is:"  + missing);
        }
    }
}
