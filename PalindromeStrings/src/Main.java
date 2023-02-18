public class Main {
    public static void main(String[] args) {

        System.out.println(isPolindrome("ccc"));
        System.out.println(isPolindrome("aba"));
        System.out.println(isPolindrome("vcc"));
        System.out.println(isPolindrome("sdsadasdasd"));
    }



    static boolean isPolindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}