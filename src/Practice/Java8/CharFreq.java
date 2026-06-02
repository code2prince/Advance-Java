package Practice.Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFreq {
    public static void main(String[] args) {
        String str="apple";
       // str.chars().mapToObj(c-> (char)c);

        Map<Character, Long> map= str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
