package Practice.String;

import java.util.*;

public class UniqueSubString {
    public static String uniqueSubString(String str){
        int n=str.length();
        String result="";
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String sub=str.substring(i,j+1);
                if(sub.length()>result.length() && isUnique(sub)){
                    result=sub;
                }
            }
        }
        return result;
    }

    // Helper function which check uniqueness
    public static boolean isUnique(String sub){
        Set<Character> set=new HashSet<>();
//        for(int i=0; i<sub.length(); i++){
//            char ch=sub.charAt(i);
            for(char ch:sub.toCharArray()){  // short hand for it
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    //----------------------------- Approach 2 Sliding Window-------------------------------------------
    public static String longestUniqueSubString(String str){
        int left=0, right=0;
        int startIndex=0, maxLen=0;
        Map<Character,Integer> map=new HashMap<>();
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
        return str.substring(startIndex,startIndex+maxLen);
    }
    public static void main(String[] arg){
        String str="abccdefabcd";

        String ans=uniqueSubString(str);
        System.out.println(ans);  // cdefab

        //Optimal Approach Sliding window
        String result=longestUniqueSubString(str);
        System.out.println(result);
    }
}
