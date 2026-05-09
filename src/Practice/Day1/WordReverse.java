package Practice.Day1;

import java.util.Stack;

public class WordReverse {
    public static void main(String[] arg) {
        String str = "Prince Kumar Sharma";
        Stack<String> st = new Stack<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                st.push(word.toString());
                word = new StringBuilder();
            }
        }
        if (!word.isEmpty()) {
            st.push(word.toString());
        }

        while (!word.isEmpty()) {
            System.out.println(st.pop());
        }
    }

}
