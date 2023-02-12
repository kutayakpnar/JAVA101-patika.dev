
import java.util.Scanner;

public class CalculatingTriangleArea {
    public static void main(String[] args) {
        int len1;
        int len2;
        int len3;


       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter the length1:");
       len1=scan.nextInt();
       scan.nextLine();
       System.out.println("Please enter the length2:");
        len2=scan.nextInt();
        scan.nextLine();
        System.out.println("Please enter the length3:");
        len3=scan.nextInt();
        scan.nextLine();

        double u= (len1+len2+len3)/2.0;

        double area=Math.sqrt(u*(u-len1)*(u-len2)*(u-len3));

        System.out.println("Area of this triangle------------> "+area);






    }
}