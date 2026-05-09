package Practice.String;

import java.util.Arrays;

public class longestCommonPrefix {
    public static String check(String[] str){
        StringBuilder ans=new StringBuilder();
        int n=str.length;
        Arrays.sort(str);
        String first=str[0];
        String last=str[n-1];
        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
//        str = ["flower", "flow", "flight"]
//        Output: "fl"
        String[] input = {"interview", "internet", "internal", "interval"};
        System.out.println(check(input)); //inter
    }
}
