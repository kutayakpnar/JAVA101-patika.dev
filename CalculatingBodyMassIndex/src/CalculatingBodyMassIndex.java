import java.util.Scanner;

public class CalculatingBodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double height;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your weight in terms of kg:");
        weight=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter your height in terms of meter:");
        height=scan.nextDouble();
        scan.nextLine();

        double result;
        result=weight/(height*height);
        System.out.println("Your body mass index is : "+result);

    }
}