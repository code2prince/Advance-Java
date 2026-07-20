package Practice.JavaConcept;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        if(str1.length()!=str2.length()){
            System.out.println(false);
        }

        char[] a=str1.toCharArray();
        char[] b=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(a);
        System.out.println(b);

        System.out.println(Arrays.equals(a,b));

        //----------------Approach 2-------------------------------------------

        if(str1.length()!=str2.length()){
            System.out.println(false);
        }

        int[] count=new int[26];
        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i)-'a']++;    //--here 'l'-'a' =12 at 12 index in count array mark 1
            count[str2.charAt(i)-'a']--;
        }

        for(int i: count){
        System.out.print(i+" ");
            if(i!=0){
                System.out.println(false);
            }
        }
        System.out.println("anagram");








    }
}
