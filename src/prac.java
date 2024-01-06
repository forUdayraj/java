import java.util.Arrays;

class prac
{
    public static void main(String[] args) {


            int[] arr = {5,1,2,6,3,3};
            int n= arr.length;
            // code here
            for (int i =0; i<n;i++){
                for(int j=1; j<n-1;j++){
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]= temp;
                    }
                }
            }
        System.out.println(Arrays.toString(arr));
        }
    }