package Practice.Day1;

import java.util.ArrayList;
import java.util.Locale;

public class StringProblemImpetus {
    public static void findSubStringSumEqualsTarget(String str, int target){
        int n=str.length();
        ArrayList<String> result=new ArrayList<>();
        for(int i=0; i<n; i++){
            int ans=0;
            for(int j=i; j<n; j++){
                ans+=str.charAt(j)-'0';
                if(ans==target) {
                    result.add(str.substring(i, j + 1));
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] arg){
        String str="1234567890";
        int target=9;
        findSubStringSumEqualsTarget(str,target);
    }
}
