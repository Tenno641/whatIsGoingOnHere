package solve;

import java.util.Random;

public class Solve {

    public static int[] sort(int[] arr) {

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        return arr;

    }

    public static void main(String[] args) {

        Random rand = new Random();

        int range = 100000;

        int[] arr = new int[range];

        for (int i = 0; i < range; i++) {
            arr[i] = rand.nextInt(range);
        }

        int[] sortedArr = sort(arr);

        for (int n : sortedArr) {
            System.out.printf("%d ", n);
        }

    }
}