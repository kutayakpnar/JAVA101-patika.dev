import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int num;
        int total=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        while(true){
            num= scan.nextInt();
            if(num%2==0 && num%4==0){
                total+=num;
            }
            else if (num%2==1){
                System.out.println("The total:" + total);
                break;
            }
        }

    }
}