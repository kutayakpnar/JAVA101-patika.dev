public class Main {
    public static void main(String[] args) {
        int[] arr={15,12,788,1,-1,778,2,0};
        nearestNumberMixAndMin(5,arr);

    }

    static void nearestNumberMixAndMin(int num,int[] arr){
        int largeNumber=arr[0];
        int smallNumber=arr[0];
        int minDiff=arr[0];
        int maxDiff=arr[0];

        for(int i=0;i< arr.length;i++){

            if(arr[i]-num>0&&arr[i]-num<maxDiff){
                maxDiff=arr[i]-num;
                largeNumber=arr[i];
            }
            if(num-arr[i]>0&&num-arr[i]<minDiff){
                minDiff=num-arr[i];
                smallNumber=arr[i];
            }
        }
        System.out.println("Nearest Max Number:"+largeNumber);
        System.out.println("Nearest Min Number:"+smallNumber);

    }
}