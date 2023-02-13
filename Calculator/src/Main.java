
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2;

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the number 1:");
        n1= scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter the number 2:");
        n2=scan.nextInt();
        scan.nextLine();

        System.out.println("Please select the operation:\n"+
                            "1.Summation\n"+
                            "2.Subtraction\n"+
                            "3.Multiplication\n"+
                            "4.Division");

        String operation=scan.nextLine();

        switch (operation){

            case "1":
                System.out.println(n1+n2);
                break;
            case "2":
                System.out.println(n1-n2);
                break;
            case "3":
                System.out.println(n1*n2);
                break;

            case "4":
                if(n2!=0){
                    System.out.println(n1/n2);

                }
                else{
                    System.out.println("Math error.");
                }

                break;

            default:
                System.out.println("Invalid operation.");
                break;

        }


    }
}