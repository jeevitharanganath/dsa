package arrays;

/**
 * Count combination of subarrays
 * where value is <= k
 */
public class CountSubArray {

    public static void main(String[] args) {
       countSubArray(new int[]{4,3,1,2,5,3,2},4);
    }
    static void countSubArray(int[] arr, int k){
        int sum =0;
        int count =0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>k)// continue i , till ele <= k
                continue;
            count =0;
            for (; i<arr.length&&arr[i]<=k ; i++) //count ele of sub array where  ele <= k
                count++;
            System.out.println("count:"+count);
            sum+=(count*(count+1))/2; //combination of arrays: n*n+1 /2 for n elements
        }
            System.out.println( arr.length *((arr.length+1) /2) -sum);
    }


}
