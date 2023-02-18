import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();

    }

    static void sorting(int[] arr){

        for(int i=0;i< arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[i]){
                    minIndex=j;

                }

            }
            if(i!=minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    static void run(){

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the dimension:");
        int n= scan.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the elements "+(i+1)+":");
            arr[i]=scan.nextInt();

        }
        sorting(arr);


    }
}