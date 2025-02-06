import java.util.ArrayList;

public class Day5 {


    //Move all zero elements at end

    //Brute force using Temp Array
//    public static int [] Move(int []arr){
//        ArrayList<Integer> temp = new ArrayList<>();
//        for(int i = 0;i<arr.length;i++){
//            if(arr[i]!=0){
//                temp.add(arr[i]);
//            }
//        }
//        int nz = temp.size();
//        for (int i = 0;i<nz;i++){
//            arr[i] = temp.get(i);
//        }
//        for(int i = nz;i<arr.length;i++){
//            arr[i] = 0;
//        }
//        return arr;
//    }


    //Optimized Approach Using Two Pointer

//    public static int [] MoveZero(int[] arr ){
//        int j = -1;
//        //Find first zero element in array
//        for (int  i = 0;i<arr.length;i++){
//            if(arr[i] == 0){
//                j = i;
//                break;
//            }
//        }
//
//        for(int  i = j+1;i<arr.length;i++){
//            if(arr[i]!=0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//
//        return arr;
//    }


    // Rotate  an array k  element

    //Brute force Using Temp Array
//    public static int [] kmove(int []arr,int d){
//        int n = arr.length;
//        int [] temp = new int[d];
//        for(int i = 0;i<d;i++){
//            temp[i] = arr[i];
//        }
//
//        for(int i = 0;i<n-d;i++){
//            arr[i] = arr[i+d];
//        }
//        for(int i = n-d;i<n;i++){
//            arr[i] = temp[i-n+d];
//        }
//        return arr;
//    }

    // Optimized Way Reversal Algorithm
    public static void KELEMENT(int []arr,int d, int n){
      Reverse(arr,0,d-1);
      Reverse(arr,d,n-1);
      Reverse(arr,0,n-1);

    }
    public static void Reverse (int []arr,int start, int end ){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]  = temp;
            start++;
            end--;
        }
    }


//Maximum Consecutive One
    public static int BN(int [] arr){
        int maxCnt = 0;
        int cnt = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                cnt++;
            }else {
                cnt = 0;
            }
            maxCnt = Math.max(maxCnt,cnt);

        }
        return maxCnt;
    }


//Linear Search
    public static int LS(int []arr, int s){

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == s){
                System.out.println(i);
                return i;
            }
        }
        return -1;

    }
    //Second largest element




    public static void main(String[] args) {
        int arr[] ={1,4,0,7,5,0,3,0};
//        int mz[] = Move(arr);
//        int mze[] = MoveZero(arr);
        int d = 3;
        int n = arr.length;
//        int []leftRotate = kmove(arr,d);
          KELEMENT(arr,d,n);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        int brr[] = {1,1,0,1,0,1,1,1,0,1};
        System.out.println("\nMaximum One: "+BN(brr));
        int f = 7;
        int [] rr = {1,3,5,7,8,10,4};
        System.out.println(f+" is presented at "+LS(rr,f));



        int m = rr.length;
        Reverse(rr,0,m-1);
        for (int i = 0;i<rr.length;i++){
            System.out.print(rr[i]);
        }


    }
}
