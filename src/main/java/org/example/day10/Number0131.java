package org.example.day10;

import java.util.ArrayList;
import java.util.List;

public class Number0131 {
    List<List<String>> res = new ArrayList<>();
    List<String> track = new ArrayList<>();

    public static void main(String[] args) {
        Number0131 t = new Number0131(); 
        String s = "aaba";
        List<List<String>> list = t.partition(s);
        for (List<String> is : list) {
            for (int i = 0; i < is.size(); i++) {
                System.out.printf("%s ", is.get(i));
            }
            System.out.printf("\n");
        }
    }

    public List<List<String>> partition(String s) {
        backtrack(s, 0);
        return res;
    }

    void backtrack(String s, int start) {
        if (start >= s.length()) {
            res.add(new ArrayList<>(track));
        }
       
        for (int i = start; i < s.length(); i++) {
            if (!isPalindrome(s,start, i)) {
                continue;
            }
            String str = s.substring(start, i+1);
            track.add(str);

            backtrack(s, i+1);
           
            track.remove(str);
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        
        for (int i = start, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
        
    }


}
