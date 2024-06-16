package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class N2942 {
    public static void main(String[] args) {
        N2942 n = new N2942();
        String[] words = {"leet", "code"};
        char x = 'e';
        for (Integer i : n.findWordsContaining(words, x)) {
            System.out.println(i);
        }
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }
}
