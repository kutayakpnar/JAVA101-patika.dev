import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c,r,x;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter C: ");
        c=scan.nextInt();
        System.out.println("Please enter R: ");
        r=scan.nextInt();
        System.out.println("C:"+c+" R:"+r);
        x=c-r;

        int numerator=1;
        for(int i=2;i<=c;i++){
            System.out.println(i);
            numerator=numerator*i;
        }
        System.out.println("NUM:"+numerator);
        int dominator1=1;
        int dominator2=1;

        for (int i=1;i<=r;i++){
            dominator1*=i;
        }
        for(int i=1;i<=x;i++){
            dominator2*=i;
            System.out.println(dominator2);
        }

        int dominator=dominator1*dominator2;
        System.out.println(dominator+" "+numerator);
        int result=numerator/dominator;

        System.out.println("The combination of "+c+" and "+r+" is: "+result);

    }
}