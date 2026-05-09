package Practice.Day1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String arg[]){
        String str="Prince kumar sharma";

        Map<Character, Long> map=str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(map);



        LocalDate data=LocalDate.now();
        System.out.println(data);

        LocalDateTime time=LocalDateTime.now();
        System.out.println(time);

    }
}
