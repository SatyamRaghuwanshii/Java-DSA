package arrays;

import java.util.Scanner;

public class input {
    public void main(){
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = sc.nextInt();
        arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        for (int val : arr){
            System.out.print(val + " ");
        }
    }
}
