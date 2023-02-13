import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int degree;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the temperature:");
        degree=scan.nextInt();

        if(degree<5){
            System.out.println("We can go skiing.");
        }
        else if (degree>=5 && degree<15){
            System.out.println("We can go cinema.");
            if(degree>10){
                System.out.println("We can go picnic.");
            }

        }
        else if(degree>=10 && degree<25){
            System.out.println("We can go picnic.");
            if(degree<=15){
                System.out.println("We can go cinema.");
            }
        }
        else{
            System.out.println("We can go swimming.");
        }
    }

}