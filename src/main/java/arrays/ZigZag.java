package arrays;

/**
 * Given an array of DISTINCT elements, rearrange the elements of array in zig-zag fashion in O(n) time.
 * The converted array should be in form a < b > c < d > e < f.
 *
 * Example:
 *
 * Input: arr[] = {4, 3, 7, 8, 6, 2, 1}
 * Output: arr[] = {3, 7, 4, 8, 2, 6, 1}
 *
 * Input: arr[] = {1, 4, 3, 2}
 * Output: arr[] = {1, 4, 2, 3}
 */

public class ZigZag {

    public static void main(String[] args) {
        int [] arr = new int[]{4, 3, 7, 8, 6, 2, 1};
        for (int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){ // swap elements if arr[i] is not less than next element on alternative iteration
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }else{
               if(arr[i]<arr[i+1]){// swap elements if arr[i] is not greater than next element on alternative iteration
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
               }
            }

        }


        /*print array*/
        boolean flag =true;
        for (int i=0;i<arr.length;i++){
            if(flag){
                System.out.print(arr[i]+" < ");
            }else{
                System.out.print(arr[i]+" > ");
            }
            flag=!flag;
        }

        System.out.println();
    }

}
