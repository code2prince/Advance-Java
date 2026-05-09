package Practice.Java8;
import java.util.*;
import java.util.stream.Collectors;

public class PracticeJava8 {
    public static void main(String[] arg){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer>evenList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        int evenSum=list.stream().filter(i->i%2==0).reduce(0, (a,b)->a+b);
        System.out.println("evenSum: "+ evenSum);

        //-----------2nd max values-------------
        int secMax=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("sec max: "+ secMax);

        //--------------------------------------------------------------------
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9,3,4,5);
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicate=list1.stream().filter(i->!seen.add(i)).collect(Collectors.toSet());
        System.out.println("duplicate: "+ duplicate);

        // 2nd approach
        Map<Integer,Long> freq=list1.stream().collect(Collectors.groupingBy(i->i, Collectors.counting()));
        System.out.println(freq);
        List<Integer>dup=list1.stream().filter(e-> freq.get(e)>1).distinct().collect(Collectors.toList());
        System.out.println("dup: "+ dup);

        Map<Boolean, List<Integer>> map =
                list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(map);



    }

}
