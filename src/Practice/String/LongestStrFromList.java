package Practice.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStrFromList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","bfjsd","dsss","gg","Prince");
        String ans=list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(ans);
    }
}
