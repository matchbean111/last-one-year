package org.example.easy;

public class N0744 {
    public static void main(String[] args) {
        N0744 t = new N0744();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(t.nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        char min = Character.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            char c = letters[i];
            if (c > target) {
                min = c < min ? c : min;
            }
        }

        min = min == Character.MAX_VALUE ? letters[0] : min;


        return min;
    }
}
