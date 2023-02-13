import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        num= scan.nextInt();
        int i;
        for(i=0;i<num;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}