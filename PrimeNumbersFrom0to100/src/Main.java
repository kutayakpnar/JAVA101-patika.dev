import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //boolean isprime=true;
        int n;
        int x = 0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n= scan.nextInt();
        for(int i=2;i<n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    x++;
                    break;
                }

            }
            if (x==0){
                System.out.println(i+" ");

            }
            x=0;



        }


    }
}