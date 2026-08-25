package SortingAndSearching;

import java.util.Arrays;

public class mergeSort {
    public void main() {
        int[] arr = {4,6,3,7,8,2};
        mergeSort(arr,0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    public void mergeSort(int[] arr, int l, int h){
        if (l<h){
            int m = (l+h)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1, h);
            sort(arr,l,m,h);
        }
    }
    public void sort(int[] arr, int l, int m, int h){
        int i = l;
        int k = l;
        int j = m+1;
        int[] b = new int[h+1];
        while(i<=m && j<=h){
            if(arr[i] <= arr[j]){
                b[k] = arr[i];
                i++;
                k++;
            }
            else {
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        if(i>m){
            while(j<=h){
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        if(j>h){
            while(i<=m){
                b[k] = arr[i];
                i++;
                k++;
            }
        }
        for (k = l; k<=h; k++){
            arr[k] = b[k];
        }
    }
}
