package Practice.JavaConcept;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(a);
        System.out.println(b);

        System.out.println(Arrays.equals(a,b));


    }
}
