import java.util.*;
import java.io.*;

class Main {

    public static String LetterCapitalize(String str) {
        // code goes here
        String[] x=str.split(" ");
        String z="";
        for(int i=0;i<x.length;i++){
            int a=x[i].length();
            String b=x[i].substring(0,1).toUpperCase();

            String c=x[i].substring(1,a);

            z+=b;
            z+=c;
            z+=" ";



        }




        return z;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}