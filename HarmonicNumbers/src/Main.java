import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        num= scan.nextInt();

        int i=1;
        int result=0;
        String s="";


        while(i<=num){
            result+=1/i;
            if(i!=num){
                s+="1/"+i+"+ ";
            }
            else{
                s+="1/"+i;
            }

            i++;

        }
        System.out.println("The harmonic number is: "+result);
        System.out.println("The harmonic serie is: "+s );


    }
}