import java.util.Scanner;

public class CalculatingVAT {
    public static void main(String[] args) {
        double money;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the amount of money:");
        money=scan.nextDouble();
        double moneyWutv =money +( money * 18/100);
        System.out.println("Money with utv: "+moneyWutv);



    }
    
}