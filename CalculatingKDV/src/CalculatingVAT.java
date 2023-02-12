import java.util.Scanner;

public class CalculatingVAT {
    public static void main(String[] args) {
        double money;
        double moneyWutv;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the amount of money:");
        money=scan.nextDouble();

        double rate;
        if(money<1001){
            rate = 0.18;
        }
        else{
            rate = 0.08;
        }
        moneyWutv=money+(money*rate);

        System.out.println("Your money with UTV-------> "+moneyWutv);

    }
    
}