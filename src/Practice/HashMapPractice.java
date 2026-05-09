package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapPractice {
    public static  void main(String[] arg){
        int arr[]={2,3,4,5,3,2,3,1};
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map); //{1=1, 2=2, 3=3, 4=1, 5=1}
        map.forEach((key,val)-> System.out.println(key+"->"+ val));
        /*
        1->1
        2->2
        3->3
        4->1
        5->1
         */


        String str="Programming";
        HashMap<Character, Integer>mp=new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        System.out.println(mp);  //{P=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}

//        mp.forEach((key,value)-> System.out.println(key+"->"+value));


        Map<Character, Long> freqMap = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        freqMap.forEach((key,val)-> System.out.println(key+"->"+val));
    }
}
