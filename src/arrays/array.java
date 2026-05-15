package arrays;

public class array {
    public void main(){
        //declaration
        int arr1[];
        int[] arr2;

        //allocation
        arr1 = new int[5];
        arr2 = new int[8];

        //initiallization
        arr1 [0] = 45;
        int[] arr3 = {0,12,32,2,5,6,7};

        //initiallization using loop
        int n = arr3.length;
        System.out.print("arr2 -->");
        for (int i=0; i<n; i++){
            arr2[i] = arr3[i];
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.print("arr3 -->");
        for (int val : arr3){
            System.out.print(val + " ");
        }
    }
}
