public class Main {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5};
        System.out.println(averageOfArray(numbers));
        System.out.println(harmonicAverageOfArray(numbers));



    }

    static int averageOfArray(int[] arr){
        int sum=0;
        int average=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        average=sum/(arr.length);
        return average;

    }
    static double harmonicAverageOfArray(int[] arr){
        int sum=0;
        int average=0;
        for(int i=0;i<arr.length;i++){
            sum+=1/arr[i];

        }
        average=arr.length/sum;
        return average;
    }
}