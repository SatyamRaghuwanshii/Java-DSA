package arrays;

import java.util.Scanner;

public class TwoDarray {
    public void main(){
        //declaration
        int[][] arr;
        //allocation
        int[][] arr2 = new int[2][4];
        //init or input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows: ");
        int row = sc.nextInt();
        System.out.print("enter cols: ");
        int col = sc.nextInt();
        arr = new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print("enter " + i + " " + j + " element: ");
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
