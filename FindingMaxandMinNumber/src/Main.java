import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int manyNum;
        System.out.println("How many numbers will you enter?");
        Scanner scan=new Scanner(System.in);
        manyNum= scan.nextInt();
        int i=1;
        int x;
        System.out.println("Please enter the number 1:");
        x= scan.nextInt();
        int maxNum=x;
        int minNum=x;
        while(i+1<=manyNum){
            System.out.println("Please enter the number "+(i+1)+":");
            int a=scan.nextInt();
            if(a>=maxNum){
                maxNum=a;
            }
            if(a<=minNum){
                minNum=a;

            }
            i++;


        }
        System.out.println("Minimum number:"+minNum);
        System.out.println("Maximum number:"+maxNum);
    }
}