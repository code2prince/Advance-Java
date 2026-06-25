package Practice.Java8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String str=null;
        //System.out.println(str.length());// NullPointerException

        //------Approach 1 normal if condition-------------
        if(str!=null){
            System.out.println(str.length());
        }else{
            System.out.println(0);
        }
        //---------Short hand with ternary operator---------
        System.out.println((str!=null) ? (str.length()): 0);

        //-----------Approach 2 Optional Class java 8 feature--------
        Optional<String> res=Optional.ofNullable(str);

        res.map(String::length).ifPresent(System.out::println);
        System.out.println(res);

    }
}
