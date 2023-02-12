import java.util.*;
public class CalculatingGrades {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter math grades:");
        int mat= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter physic grades:");
        int phy= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter chem grades:");
        int chem= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter hist grades:");
        int hist= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter music grades:");
        int mus= scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter the number of lesson");
        int lesson= scan.nextInt();

        double average=mat+phy+chem+hist+mus;
        double result=average/lesson;

        System.out.println("Your gpa is: "+result);
        boolean x= result>60;
        if (x==true){
            System.out.println("You pass the class.");
        }
        else{
            System.out.println("You did not pass the class." );
        }

    }
}