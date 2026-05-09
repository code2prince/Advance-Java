package Practice.String;

import java.util.ArrayList;

public class SubStringProblem {
    public static void main(String[] arg) {
        String str = "1234567890";
        int n = str.length();
        int target = 9;
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += str.charAt(j) - '0';
                if (sum == target) {
                    res.add(str.substring(i, j + 1));
                }
             //   res.add(str.substring(i,j+1));
            }
        }
        System.out.println(res);
    }

}

