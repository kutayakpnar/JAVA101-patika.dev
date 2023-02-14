import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the n:");
        int n= scan.nextInt();
        System.out.println(fib(n));


    }
    static int fib(int n){
        //f(n)=f(n-1)+f(n-2) , f(1)=1 , f(2)=1

        if( n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
}