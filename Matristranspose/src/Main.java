public class Main {
    public static void main(String[] args) {

       int[][] arr={{2,3,4},{5,6,4}};
       findTranspose(arr);
    }




    static void findTranspose(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;

        int[][] transpose=new int[n][m];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                transpose[j][i]=arr[i][j];


            }
        }
        printArray(transpose);
    }
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}