package Practice.String;

public class LongestSubStringNo {
    public static void largestSubString(String str){
        int n=str.length();
        int largest=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String sub=str.substring(i,j+1);
                int a=Integer.parseInt(sub);
                if(a>largest && a%2==1){
                    largest=a;
                }
            }
        }
                System.out.println(largest);
    }
    public static void main(String[] arg){
        String str="0213298";
        largestSubString(str);

    }

}
