import java.util.Arrays;

public class Day8 {


    //Longest Even and odd subarray (Brute Force)
    public static int EvenOdd(int []arr,int n){
        int length = 0;
        for(int i = 0;i<n;i++){
            int count = 1;
            for(int j = i+1;j<n;j++){
                if(arr[j-1]%2==0 && arr[j]%2!=0 || arr[j-1]%2!=0 && arr[j]%2==0){
                    count++;

                }else break;
                length = Math.max(count,length);
            }
        }

        return length;
    }

    //Longest Even and odd subarray (Optimized Approach)
    public static int Longestsubarray(int []arr,int n){
        int maxLength = 0;
        int count = 1;
        for(int i = 1;i<n;i++){
                if(arr[i-1]%2==0 && arr[i]%2!=0 || arr[i-1]%2!=0 && arr[i]%2==0){
                    count++;

                }else count = 1;
                maxLength = Math.max(count,maxLength);
            }


        return maxLength;
    }


    //Find Equillibrium Point in an Array (Brute Force)
    public static int findEqui(int []arr, int n){
        for (int i = 0;i<n;i++){
            int leftSum = 0;
            for(int j = 0; j<i;j++){
                leftSum+=arr[j];
            }
            int rightSum = 0;
            for(int j = i+1;j<n;j++){
                rightSum+=arr[j];

            }
            if(leftSum==rightSum){
              return i;
            }
        }
        return -1;
    }

    //Find Equillibrium Point in an Array (Optimized Approach)
    public static int Equi(int []arr, int n) {
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        int rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            } else {
                leftSum += arr[i];
            }
        }
        return -1;

    }

    //Pairs in a given array whose sum is a given number k
    public static void Pair(int []arr,int n,int target) {
        Arrays.sort(arr);
        int start = 0;
        int end = n-1;

        while(start<end){
            if(arr[start]+arr[end]==target){
                System.out.println("("+arr[start]+","+arr[end]+")");
                start++;
                end--;

            }else if(arr[start]+arr[end]>target){
                end--;
            }else {
                start++;
            }

        }
    }

    public static void main(String[] args){
            int[] arr = {5, 3, 1, 2, 7, 4, 8, 9};
            int n = arr.length;
            System.out.println("Longest Even/Odd Subarray: " + EvenOdd(arr, n));
            System.out.println("Longest Even/Odd Subarray: " + Longestsubarray(arr, n));

            int[] equi = {-7, 1, 5, 2, -4, 3, 0};
            int m = equi.length;
            //Brute Force
            System.out.println("Equillibirium: " + findEqui(equi, m));
            // Optimized Approach
            System.out.println("Equillibirium: " + Equi(equi, m));


            Pair(arr,n,3);


        }
}
