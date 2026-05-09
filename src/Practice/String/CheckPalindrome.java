package Practice.String;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String ans=s.replaceAll("[^a-zA-Z0-9]","");
        String str=ans.toLowerCase();
        System.out.println(str);

//        StringBuilder newStr=new StringBuilder();
//        System.out.println('9'-'0');
//        //49 74
//        for(int i=0; i<str.length(); i++){
//            char ch=str.charAt(i);
//            if(ch-'0'>=49 && ch-'0'<=74){
//                newStr.append(ch);
//            }
//        }
//        System.out.println(newStr);


        System.out.println( checkPalindrome(str));

    }
}
