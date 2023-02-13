import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float pearFee= 2.14F;
        float appleFee=3.67F;
        float tomatoFee=1.11F;
        float bananaFee=0.95F;
        float aubergineFee=5F;
        double totalFee=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("How many kilos of pears did you buy?");
        double kgPear= scan.nextDouble();
        scan.nextLine();
        totalFee+=pearFee*kgPear;

        System.out.println("How many kilos of apples did you buy?");
        double kgApple= scan.nextDouble();
        scan.nextLine();
        totalFee+=appleFee*kgApple;

        System.out.println("How many kilos of tomatoes did you buy?");
        double kgTomato= scan.nextDouble();
        scan.nextLine();
        totalFee+=tomatoFee*kgTomato;

        System.out.println("How many kilos of bananas did you buy?");
        double kgBanana= scan.nextDouble();
        scan.nextLine();
        totalFee+=bananaFee*kgBanana;

        System.out.println("How many kilos of aubergines did you buy?");
        double kgAubergine= scan.nextDouble();
        scan.nextLine();
        totalFee+=aubergineFee*kgAubergine;

        System.out.println("The total fee is: "+totalFee);

1



    }
}