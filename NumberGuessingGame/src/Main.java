import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        runGame();

    }

    static void runGame(){
        int totalRight=5;
        int[] guess=new int[5];
        int index=0;
        int selectedNumber;
        Random rnd =new Random();
        Scanner scan=new Scanner(System.in);
        int number= rnd.nextInt(100);
        boolean isWin=false;
        boolean isWrong=false;



        while (totalRight>0){
            System.out.println("Please enter your guess:");
            selectedNumber= scan.nextInt();

            if(selectedNumber<0 && selectedNumber>99){

                System.out.println("Please pay attention to rules.");
                if(isWrong){
                    totalRight --;
                    System.out.println("You made many mistakes.Your total right: "+totalRight);
                }
                else{
                    isWrong=true;
                    System.out.println("Please try again.");
                }
            }
            if(selectedNumber==number){
                isWin=true;
                System.out.println("You won the game.");
                break;
            }else {
                totalRight--;
                System.out.println("Your choice is wrong please try again.Remaining rights:"+totalRight);
                guess[index]=selectedNumber;
                index++;

            }





        }
        if(isWin){
            System.out.println("Congratulations.You won the game.");

        }else {
            System.out.println("You loose the game.Please try again.");
            System.out.println("Your choices are:"+Arrays.toString(guess));
            System.out.println("The number is:"+number);
        }
    }

}