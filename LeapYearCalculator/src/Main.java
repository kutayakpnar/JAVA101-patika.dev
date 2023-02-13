import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the year:");
        year=scan.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println(year+" is a leap year.");
        }
        else if(year%100==0 && year%400==0){
            System.out.println(year +" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }

    }

}
