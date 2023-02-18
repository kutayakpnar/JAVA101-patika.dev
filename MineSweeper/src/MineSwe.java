import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSwe {
    int rowNumber, colNumber;
    int[][] board;
    int[][] map;
    int size;
    boolean game=true;


    Random rnd = new Random();
    Scanner scan = new Scanner(System.in);

    MineSwe(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int success=0;
        int row,col;
        prepareGame();
        printArray(map);
        System.out.println("The game has started.");
        while (game){
            printArray(board);
            System.out.println("Row :");
            row=scan.nextInt();
            System.out.println("Column :");
            col=scan.nextInt();
            if(map[row][col]!=-1){
                checkMine(row,col);
                success++;
                if(success==(size*(size/4))){
                    System.out.println("You won!");
                    break;
                }
            }else{
                game=false;
                System.out.println("Game over!");
            }


        }
    }
    void checkMine(int r,int c){
        if(map[r][c]==0){
            if((c<colNumber-1)&&map[r][c+1]==-1){
                board[r][c]++;
            }
            if((r<rowNumber-1)&&map[r+1][c]==-1){
                board[r][c]++;
            }
            if((r>0)&&map[r-1][c]==-1){
                board[r][c]++;
            }
            if(c>0&& map[r][c-1]==-1){
                board[r][c]++;
            }

        }
        if(board[r][c]==0){
            board[r][c]=-2;
        }

    }

    public void prepareGame() {
        int randRow, randCol;
        int count = 0;
        while (count != size / 4) {
            randRow = rnd.nextInt(rowNumber);
            randCol = rnd.nextInt(colNumber);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1; //-1 represents bomb.
                count++;
            }
        }
    }

    public void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}




