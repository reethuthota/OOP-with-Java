// Create two threads with one thread for sorting and another thread for searching a number

package MultiThreading;

import java.util.Arrays;

class Sorting extends Thread {
    int[] array;

    public Sorting (int[] array) {
        this.array = array;
    }

    public void run() {
        System.out.println("Sorting elements in the array...");

        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Array sorted: " + Arrays.toString(array));
    }
}

class Searching extends Thread {
    int[] array;
    int target;

    public Searching (int[] array, int target) {
        this.array = array;
        this.target = target;
    }

    public void run() {
        System.out.println("Searching thread started...");
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (i == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Target number found in the array.");
        } else {
            System.out.println("Target number not found in the array.");
        }
    }
}

public class SortingSearching {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 10};
        int target = 7;

        Sorting t1 = new Sorting(array);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        Searching t2 = new Searching(array, target);
        t2.start();
    }
}
