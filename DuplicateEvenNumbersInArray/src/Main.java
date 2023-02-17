public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5,6,7,8,8,9};
        int[] duplicate= new int[arr.length];
        int duplicateIndex=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i != j && arr[i] == arr[j]&& arr[i]%2==0){
                    if(isExist(duplicate,arr[i])){

                        duplicate[duplicateIndex++]=arr[i];

                    }
                }
            }
        }
        printArray(duplicate);
    }
    static boolean isExist(int[] arr,int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    static void printArray(int[] arr){
        for(int i:arr ){
            if(i!=0){
                System.out.print(i+" ");

            }
        }
    }
}