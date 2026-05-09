package Practice.Day1;

public class LongestPalindrome {
    public static boolean isPalindrome(String s){
        int start=0, end=s.length()-1;
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abcdedcgds";
        int n=str.length();
        String ans="";
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String currentSubString=str.substring(i,j);
                if(isPalindrome(currentSubString) && currentSubString.length()>ans.length()){
                        ans = str.substring(i, j);
                }
            }
        }
        System.out.println(ans);
    }
}
