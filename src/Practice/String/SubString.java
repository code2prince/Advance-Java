package Practice.String;

import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String str="1234";
        ArrayList<String> ans=new ArrayList<>();
        int n=str.length();
        for(int i=0;i<n; i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i; j<n; j++){
               // ans.add(str.substring(i,j+1));

                // Approach 2 without use of inbuild subString() method with use of StringBuilder()
                sb.append(str.charAt(j));
                ans.add(sb.toString());
            }
        }

        System.out.println(ans);
    }
}
