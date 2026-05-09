package Practice.Day1;

import java.util.ArrayList;

public class ReverseArrayByD {
    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;

            s=s+e;
            e=s-e;
            s=s-e;
        }
    }

    public static void main(String[] a) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int d = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = d; i < n; i++) {
            ans.add(arr[i]);
        }
        for (int i = 0; i < d; i++) {
            ans.add(arr[i]);
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println("Approach 2: ");
        // Approach 2
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
