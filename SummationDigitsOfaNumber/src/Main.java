import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num= scan.nextInt();
        int total=0;
        int basamak;
        while (num>1){
            basamak=num%10;
            total+=basamak;
            num=num/10;

        }
        System.out.println("The summation of digits:" + total);
    }
}