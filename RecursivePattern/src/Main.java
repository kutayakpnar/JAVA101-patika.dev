import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = scan.nextInt();
        int temp = num;
        pattern(num, temp);

    }

    static void pattern(int num, int temp) {
        //System.out.println(num);
            if(num>0){
                System.out.println(num);

                pattern(num-5,temp);
            }
            if (num<=0){
                pattern2(num,temp);
            }


    }
    static void pattern2(int num,int temp){
        if(num<=temp){
            System.out.println(num);
            pattern2(num+5,temp);
        }

    }
}
