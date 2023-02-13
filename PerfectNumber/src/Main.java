import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the positive number.To EXIT press '0' ");
        while (true){
            num= scan.nextInt();
            if(num==0){
                System.out.println("Exit from program.");
                break;
            }

            int result=0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    result+=i;
                }
            }
            if(result==num){
                System.out.println(num+ " is a perfect number.");
            }
            else{
                System.out.println(num+" is not a perfect number.");
            }
        }

    }
}