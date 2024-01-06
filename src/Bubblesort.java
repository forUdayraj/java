import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,1,2,6,3,3};

        for(int i =0;i<arr.length;i++){
            
            //run the steps n-1 times
            for(int j = 1; j<arr.length-i;j++){
                
                // swap if the item is smaller than the previous value
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
