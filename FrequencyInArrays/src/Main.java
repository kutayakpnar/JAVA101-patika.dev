import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,20,20,10,10,20,5,20};
        findFreq(arr);


    }
    static void findFreq(int[] arr) {
        int[] olderVals=new int[arr.length];

        for (int i=0;i<arr.length-1;i++){
            int count=1;
            if (!isFind(olderVals,arr[i])) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i]+"-"+count);
            }
            olderVals[i]=arr[i];



        }

    }
    static boolean isFind(int[] arr,int value){
        for(int i:arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
}