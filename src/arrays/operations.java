package arrays;

import java.util.Scanner;

public class operations {
    public void main(){
        int[] arr;
        int sum = 0;
        int multiply = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int size = sc.nextInt();
        arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }
        int minimum = arr[0];
        int maximum = arr[0];
        for (int val : arr){
            System.out.print(val + " ");
            sum += val;
            multiply *= val;
            maximum = Math.max(maximum,val);
            minimum = Math.min(minimum,val);
        }

        System.out.print("\ntotal: " + sum);
        System.out.print("\nmultiply: " + multiply);
        System.out.print("\nmaximum: " + maximum);
        System.out.print("\nminimum: " + minimum);
    }
}
