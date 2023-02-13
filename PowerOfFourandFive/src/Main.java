import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        num=scan.nextInt();
        int i;
        //The power of 4:
        System.out.println("The power of 4:");
        for (i=1;i<num;i*=4){
            System.out.print(i+" ");

        }
        System.out.println(""); // to make terminal view easier
        System.out.println("The power of 5:");
        for(i=1;i<num;i*=5){
            System.out.print(i+" ");
        }
    }
}