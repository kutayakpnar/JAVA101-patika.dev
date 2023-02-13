import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of rows:");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
                for (int x = 1; x<=(2*i)-1;x++) {
                    System.out.print("*");
                }
                System.out.println();


            }
        for (int i=n-1;i>=1;i--){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
