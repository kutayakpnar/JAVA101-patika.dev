import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,n3;
        System.out.println("Please enter 3 numbers for sorting:");
        Scanner scan=new Scanner(System.in);
        n1= scan.nextInt();
        n2=scan.nextInt();
        n3= scan.nextInt();

        if(n1>n2 && n1 > n3){
            if(n2>n3){
                System.out.println(n1+">"+n2+">"+n3);
            }
            else{
                System.out.println(n1+">"+n3+">"+n2);
            }
        }
        else if(n2>n3 && n2>n1){
            if(n3>n1){
                System.out.println(n2+">"+n3+">"+n1);

            }
            else{
                System.out.println(n2+">"+n1+">"+n3);
            }

        }
        else if(n3>n2 && n3>n1){
            if(n2>n1){
                System.out.println(n3+">"+n2+">"+n1);
            }
            else {
                System.out.println(n3+">"+n1+">"+n2);
            }

        }
    }
}