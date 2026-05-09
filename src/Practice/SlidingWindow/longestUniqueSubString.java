package Practice.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class longestUniqueSubString {
    public static String longestUniqueSubStr(String str){
        int left=0;
        int maxLen=0;
        int startIndex=0;
        Set<Character> set=new HashSet<>();
        for(int right=0; right<str.length(); right++){
            char ch=str.charAt(right);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);

            if(right-left+1> maxLen){
                maxLen=right-left+1;
                startIndex=left;
            }

        }
        return str.substring(startIndex, startIndex+maxLen);

    }
    public static void main(String[] args) {
        String str="abcdechfv";
        System.out.println("longest unique subStr: "+longestUniqueSubStr(str));  // longest unique subStr: dechfv
    }
}
