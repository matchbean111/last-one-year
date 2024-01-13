package org.example.day08;

import java.util.LinkedList;

public class Number1047 {
    public static void main(String[] args) {
        String s= "abbaca";
        System.out.println(removeDuplicates(s));

    }

    private static String removeDuplicates(String s) {
        int n = s.length();
//        if (n % 2 == 1) return false;

        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(ch);
            }else {
                char p = stack.getFirst();
                if (p==ch){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}
