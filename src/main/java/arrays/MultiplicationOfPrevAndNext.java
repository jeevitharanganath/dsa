package arrays;

import java.util.Arrays;

/**
 * Replace each element by mul of pre and next elements.
 */
public class MultiplicationOfPrevAndNext {
    public static void main(String[] args) {
        multiplicationOfPrevAndNext(new int[]{2, 4, 5, 7, 8});
    }

    /**
     * multiply prev and next element
     * store current element as prev
     * store the result in the arr[i]
     */
    private static void multiplicationOfPrevAndNext(int[] arr) {
        int prev=arr[0],curr,res;
        for (int i = 0; i < arr.length; i++) {
            curr=arr[i];
            if(i==0){
                arr[i]=prev*arr[i+1];
            } else if(i== arr.length-1){
                res=curr*prev;
                arr[i]=res;
            }
            else{
                res=prev*arr[i+1];
                prev=curr;
                arr[i]=res;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }


    private static void multiplication(int[] arr) {
        int [] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i==0)
                res[i]=arr[i]*arr[i+1];
            else if(i== arr.length-1)
                res[i]=arr[i-1]*arr[i];
            else
                res[i]=arr[i-1]*arr[i+1];

        }

        for (int i = 0; i < res.length; i++) {
            arr[i]=res[i];
        }
        Arrays.stream(res).forEach(System.out::println);
    }


}
