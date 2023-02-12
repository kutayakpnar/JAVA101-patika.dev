import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double initialFee=10;
        double totalWay;
        double rate=2.2;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the total way in terms of km:");
        String way=scan.nextLine();
        totalWay=Double.parseDouble(way);
        double totalFee=initialFee+(totalWay*rate);

        totalFee = (totalFee<20) ? 20:totalFee;

        System.out.println("Total Taxi Fee---------------> "+totalFee);

    }
}