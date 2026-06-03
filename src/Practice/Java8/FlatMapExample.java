package Practice.Java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>>nestedList= Arrays.asList(
                Arrays.asList("A","B"),
                Arrays.asList("C","D","e")
        );

        List<String>res=nestedList.stream().flatMap(i->i.stream()).toList();
        //-------Short hand-----------------
        List<String>res1=nestedList.stream().flatMap(Collection::stream).toList();

        System.out.println(res);  //[A, B, C, D, e]

        System.out.println(res.stream().map(i->i.toUpperCase()).toList()); //[A, B, C, D, E]





        int[][] arr={{1,2,3},{4,5,6},{7,8}};
        List<Integer>list=Arrays.stream(arr).flatMapToInt(i-> Arrays.stream(i)).boxed().toList();
        //---------Short hand-----------------
        List<Integer>list1=Arrays.stream(arr).flatMapToInt(Arrays::stream).boxed().toList();

        System.out.println(list);  //[1, 2, 3, 4, 5, 6, 7, 8]

        //----------------Split char from String------------------
        List<String>name=Arrays.asList("Prince","Sharma");
        List<String>charList=name.stream().flatMap(i->Arrays.stream(i.split("")))
                .collect(Collectors.toList());

        System.out.println(charList); // [P, r, i, n, c, e, S, h, a, r, m, a]




    }
}
