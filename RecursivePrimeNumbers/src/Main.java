import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = scan.nextInt();
        if (!isPrime(num, i)) {
            System.out.println(num + " is not a prime number.");
        } else {
            System.out.println(num + " is a prime number.");
        }


    }

    static boolean isPrime(int number, int i) {

        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % i != 0 && number >= i - 1) {
            return true;
        } else {
            if (number % i == 0) {
                return false;
            } else {
                return isPrime(number, i + 1);

            }

        }
    }
}
