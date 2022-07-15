package arrays;

/**
 * 4. Two sorted Array given X , find Pair from A, B array such that abs(A,B) is least wrt to X.
 */
public class NearestSumDifference2SortedArrays {

    public static void main(String[] args) {
        int [] arr = new int[]{2,3,6,8};
        int [] arr1 = new int[]{10,20,30,40,50};
        System.out.println( minDiff2SortedArrays(arr , arr1,60));
        System.out.println( minDiff2SortedArrays(arr , arr1,34));

    }

    private static int minDiff2SortedArrays(int[] arr1, int[] arr2, int x ) {
        int pointer1=0; // two pointer approach
        int pointer2=arr2.length-1;
        //if x> sum of maximum element in the arrays, then we dont need to calculate
        if(x>arr1[arr1.length-1]+arr2[arr2.length-1]){
            return Math.abs(x -(arr1[arr1.length-1]+arr2[arr2.length-1]));
        }
        int min=Integer.MAX_VALUE;
        while(pointer1<=arr1.length-1&&pointer2>=0){
                 min = Math.min(min,Math.abs(x-(arr1[pointer1]+arr2[pointer2])));
                if(arr1[pointer1]+arr2[pointer2]>x){
                    pointer2--;

                } else{
                    pointer1++;
                }

        }
        return min;
    }


}
