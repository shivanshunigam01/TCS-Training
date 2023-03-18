        import java.util.Scanner;

        public class armstorng {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the 1st range: ");
            int lowerLimit = input.nextInt();
            System.out.print("Enter the 2nd range: ");
            int upperLimit = input.nextInt();
            input.close();

            for (int i = lowerLimit; i <= upperLimit; i++) {
                if (isArmstrong(i)) {
                    System.out.println(" The armstrong numbers are: "+i);
                
                }
            }
        }

        public static boolean isArmstrong(int n) {
            int originalNumber, remainder, result = 0;
            originalNumber = n;

            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, countDigits(n));
                originalNumber /= 10;
            }

            return result == n;
        }

        public static int countDigits(int n) {
            int count = 0;
            while (n != 0) {
                count++;
                n /= 10;
            }
            return count;
        }
        }
