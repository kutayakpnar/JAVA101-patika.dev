import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int number= scan.nextInt();
        System.out.println(isPalindrom(number));
    }
    static boolean isPalindrom(int number){
        int temp=number;
        int reversedNumber=0;
        int lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reversedNumber=reversedNumber*10 +lastNumber;
            temp/=10;
        }
        return number == reversedNumber;
    }

}