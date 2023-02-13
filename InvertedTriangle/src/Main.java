import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of rows:");
        n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=(2*(n-i))-1;a++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}