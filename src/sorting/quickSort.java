package sorting;

import java.util.Arrays;

public class quickSort {
    public void main(){
        int[] arr = {1,6,3,78,9,3,2};
        int l = 0;
        int h = arr.length-1;
        quickSort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }
    public void quickSort(int[] arr, int l, int h){
        if (l < h) {
            int j = partition(arr,l,h);
            quickSort(arr,l,j-1);
            quickSort(arr,j+1,h);
        }
    }
    public int partition(int[] arr,int l,int h){
       int p = l;
       int i = l;
       int j = h+1;
       while(i<j){
           do{
               i++;
           }while( arr[i] < arr[p]);
           do{
               j--;
           }while(arr[j] > arr[p]);
           if(i<j){
               swap(arr, i,j);
           }
       }
       swap(arr,j,p);
       return j;
    }
    public void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
