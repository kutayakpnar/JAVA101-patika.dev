import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int power;
        int result=1;
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the number:");
        num= scan.nextInt();
        System.out.println("Please enter the power:");
        power=scan.nextInt();
        int k;
        for(k=1;k<=power;k++){
            result*=num;

        }

        System.out.println("Result:"+result);
    }
}