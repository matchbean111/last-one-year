package org.example.easy;

public class N3110 {
    public static void main(String[] args) {
        String s = "zaz";
        System.out.println(scoreOfString(s));
    }

    public  static int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return score;
    }
}
