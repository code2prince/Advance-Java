package Practice.String;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LongestUniqueSubstring {
    public static String longestUniqueSubStr(String str){
        int left=0, right=0, startIndex=0, maxLen=0;
        Map<Character,Integer> map= new HashMap<>();
        while(right<str.length()){
            char ch=str.charAt(right);
            if(map.containsKey(ch)){
                left=Math.max(left, map.get(ch)+1);
            }
            map.put(ch,right);

            if(maxLen < right-left+1){
                maxLen=right-left+1;
                startIndex=left;
            }
            right++;
        }
        return str.substring(startIndex, startIndex+maxLen);
    }

    public static void main(String[] args) {
        String str="abcdafbed";
        String ans=longestUniqueSubStr(str);
        System.out.println(ans);
    }
}
