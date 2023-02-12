import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        double centerAngle;
        double pi=3.14;
        double area;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        radius= scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter the degree of center angle:");
        centerAngle= scan.nextDouble();

        area=(pi*(radius*radius)*centerAngle)/360;
        System.out.println("Area of the circle is: "+area);

    }
}