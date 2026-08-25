package SortingAndSearching;

import java.util.Arrays;

public class binarySearch {
    public void main(){
        int[] arr = {1,56,78,90,456,478,498};
        int target = 78;
        int i = divide(arr,0,arr.length-1, target);
        System.out.println(i);
    }
    public int divide(int[] arr, int l, int h, int target){
        if(l<=h){
            int mid  = l + (h-l)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                return divide(arr, l,mid-1,target);
            }else{
                return divide(arr,mid+1, h, target);
            }
        }
        return -1;
    }
}
