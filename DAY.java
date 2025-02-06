public class Day4 {

    //Binary Search in Sorted Array
    public static int Binary(int []arr,int key){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(key>arr[mid]) low = mid+1;
            else high = mid - 1;

        }
        return -1;

    }

    //Using Recursion
    public static int BR(int [] arr, int low, int high, int target){
        int mid = low + (high-low)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid]<target) return BR(arr,low=mid+1,high,target);
        else return BR(arr,low,high=mid-1,target);

    }
    //Second largest element
    public static int sl(int [] arr){
        int larget = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>larget){
                secondlargest = larget;
                larget = arr[i];
            }else if(arr[i]>secondlargest && arr[i]!=larget){
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    //Check Array is sorted or not
    public static boolean isSorted(int [] arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1])return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,7,9,10,11,15};
        int target = 7;
        int ind  = Binary(arr,target);
        if(ind == -1){
            System.out.println("Target index does not exist");
        }else {
            System.out.println("Target index exist at: "+ind);
        }

        int index  = BR(arr,0,arr.length-1,target);
        if(index == -1){
            System.out.println("Target index does not exist");
        }else {
            System.out.println("Target index exist at: "+index);
        }

        System.out.println("Second Largest element in array: "+sl(arr));

        if(isSorted(arr)){
            System.out.println("Array is Sorted");
        }else {
            System.out.println("Array ain't Sorted");
        }
    }
}
