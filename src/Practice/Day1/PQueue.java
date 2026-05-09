package Practice.Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] arg) {
        int[] arr = {3, 2, 0, 5, 4, 2, 3, 6, 7, 9, 2};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : arr) {
            pq.add(i);
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
