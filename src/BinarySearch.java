public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={-18,-12,0,1,2,3,3,4,7,8,15,15,16,18};
        int ans = binarySearch(arr, 15);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length;

        while (start <= end){
            //find middle element
            int mid = start + (end - start) / 2;
            if( target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}