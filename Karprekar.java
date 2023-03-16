import java.util.*;

public class Karprekar {

    public static int digitsCount(int n) {
        int d = 0;

        while (n > 0) {
            d++;
            n /= 10;
        }
        return d;
    }

    public static boolean isKaprekar(int num) {
        int square = num * num;
        int totalDigits = digitsCount(square);
        int sum;

        if (num == 1) {
            return true;
        }

        for (int i = 1; i < totalDigits; i++) {
            int power = (int) Math.pow(10, i);

            if (square % power == 0) {
                continue;
            }

            sum = (square / power) + (square % power);

            if (sum == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int no;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        no = sc.nextInt();

        if (isKaprekar(no)) {
            System.out.println(no + " is a Kaprekar number");
        } else {
            System.out.println(no + " is not a Kaprekar number");
        }

    }

}
