package Practice.coreJava;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="applea";
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        char res=' ';
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(map.get(ch)==1){
                res=ch;
                break;
            }
        }

        System.out.println(res);

        //-------Approach 2--------------------------
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }



    }
}
