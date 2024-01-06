public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3};
        sort(arr);//calling function sort

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // Check if the element is already at its correct position
            if (arr[i] != arr[correctIndex]) {

                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
