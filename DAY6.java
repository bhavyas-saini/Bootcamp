import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Day6 {

    //Program to print all subarray in an array
    public static void Printsubarray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    System.out.println("[" + arr[i] + "]");
                } else {
                    System.out.println("[" + arr[i] + "," + arr[j] + "]");
                }
            }
        }
    }
    // Brute force of Maximum Sum of  Subarray
    public static void Maxsubarray(int [] arr,int n){
        int maxSum = 0;
        for(int i =0 ;i<n;i++){
            int currentSum = 0;
            for (int j = i;j<n;j++){
                currentSum = currentSum+arr[j];
                maxSum = Math.max(currentSum,maxSum);
            }
        }
        System.out.println("Maximum Sum of Subarray is : "+maxSum);
    }

    // Optimized approach of Maximum Sum of  Subarray
        public static int Kadanes(int []arr, int n){
        int cs = 0;
        int ms = 0;
        for(int i = 0;i<n;i++){
            cs +=arr[i];
            ms = Math.max(cs,ms);
            if(cs<0){
                cs = 0;
            }
        }
        return ms;
    }
    //Maximum sum of subarray of size k by BruteForce approach
    public static void Ksum(int []arr,int n,int size){
        int ms = 0;

        for(int i = 0;i<=n-size;i++){
            int cs = 0;
            for(int j = i;j<i+size;j++){
                cs+=arr[j];
            }
            ms = Math.max(ms,cs);
        }

        System.out.println(ms);
    }



    //Maximum sum of subarray of size k by optimized approach
       public static void SlidingWindow(int []arr,int n,int size){
        int ms = 0;

        for(int i = 0;i<size;i++){
            ms +=arr[i];
        }
        int windowSum = ms;
        for(int i = size; i<n;i++){
            windowSum += arr[i] - arr[size-i]; //arr[i] adding current element and arr[size-i] removing last element
            ms = Math.max(ms,windowSum);
        }
           System.out.println(ms);
       }


       public static  void cont(int [] arr1, int m){
        int cnt = 0, cnt1 = 0, cnt2 = 0;
        for(int i  = 0;i<m;i++){
            if(arr1[i]==0){
                cnt++;
            }else if(arr1[i]==1){
                cnt1++;
            }else cnt2++;
        }
           for(int i = 0;i<cnt;i++){
            arr1[i]=0;
          }
           for(int i = cnt;i<cnt+cnt1;i++){
               arr1[i]=1;
           }
           for(int i = cnt1;i<cnt1+cnt2;i++){
               arr1[i]=2;
           }

           for(int i = 0;i<m;i++){
               System.out.print(arr1[i]);
           }

       }

       public static void Swap(int []arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
       }
       public static void Dutch(int []arr,int m){
          int start = 0;
          int end = arr.length-1;
          int mid = 0;
          while(mid<=end){
              if(arr[mid]==0){
                  Swap(arr,arr[start],arr[mid]);
                  start++;
                  mid++;
              }else if(arr[mid]==1){
                  mid++;
              }else if(arr[mid]==2){
                  Swap(arr,arr[mid],arr[end]);
                  end--;
              }
          }
           System.out.println();
           for(int i = 0;i<m;i++){
               System.out.print(arr[i]);
           }

       }


       //Union of two sorted array (Better Approach)
    public static void union(int [] arr1, int n,int arr2[], int m){
        HashSet<Integer> s = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(arr1[i]);
        }
        for(int i = 0;i<m;i++){
            list.add(arr2[i]);
        }
        for(int it: list){
            s.add(it);
        }
        System.out.println("Union of two Array: ");
        for(int val: s){
            System.out.print(val);
        }
    }

    //Intersection b/w two sorted array
        public static void main (String[]args){
            int[] arr = {4, 0, 3, 6};
            Printsubarray(arr, arr.length);
            Maxsubarray(arr,arr.length);
          int maxSum =   Kadanes(arr,arr.length);
          System.out.println("Maximum Sum of Subarray is : "+maxSum);
          Ksum(arr,arr.length,3);
          SlidingWindow(arr,arr.length,3);
          int []a = {0,2,1,0,1,1,2,2};
          cont(a,a.length);
          Dutch(a,a.length);
          int []ar1= {5,4,3,2,1};
          int []ar2={1,2,9,8,6,3};
          int n = ar1.length;
          int m = ar2.length;
            System.out.println();
          union(ar1,n,ar2,m);


        }
    }
