import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance,age,type;
        double fee;
        double discount=0;




        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the total distance:");
        distance= scan.nextInt();
        if(distance<0){
            System.out.println("Wrong information.");
        }
        scan.nextLine();
        fee=distance*0.1;
        System.out.println("Total fee: "+fee);

        System.out.println("Please enter your age:");
        age=scan.nextInt();
        scan.nextLine();
        if(age<0){
            System.out.println("Wrong information.");
        }
        if (age<12){
            discount+=fee*0.5;
        }
        if(age>=12 && age<24){
            discount+=fee*0.1;
        }
        if(age>65){
            discount+=fee*0.3;
        }
        System.out.println("Please enter the flight type 1:Departure,2:Round Trip.");
        type=scan.nextInt();
        scan.nextLine();
        double newFee=fee-discount;

        if(type != 1 && type != 2){
            System.out.println("Wrong information.");
        }
        if (type==2) {
            newFee=newFee*0.8;

        }

        System.out.println(newFee);


    }
}