import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,56,75};
        System.out.println("Pick you target in between"+ Arrays.toString(arr)+"=> ");
        int target = sc.nextInt();
//       int target = 56;
        int start =0;
        int end= arr.length;
        while(true){
            int mid = start +(end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                System.out.println(mid);
                break;
            }
        }
    }
}