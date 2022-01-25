import java.sql.Array;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {98,23, 45, 76, 17, 24};

        for (int i = 0; i < arr.length-1; i++) {
            int index = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[index])
                    index=j;

            }

            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
