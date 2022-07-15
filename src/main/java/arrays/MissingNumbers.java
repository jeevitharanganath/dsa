package arrays;

/**
 * missing number of sequence n+1 element
 */
public class MissingNumbers {

    public static void main(String[] args) {
        int n =10;
        int [] solarr = new int[n+1]; //temp array to mark as 1 if its present
        int [] arr = new int[]{1,2,3,4,5,6,7,9,10,11};
        for (int i:arr)
            solarr[i-1]=1;
        for (int i=0;i<solarr.length;i++){  //index+1 of temp array with 0 value is not present in sequence
            if(solarr[i]!=1)
                System.out.println(i+1);
        }


    }
}

//davedhaval87@gmail.com
//davedhaval87@gmail.com