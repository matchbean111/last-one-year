package org.example.day07;

public class Number0345 {
    public static void main(String[] args) {
        String r = reverseVowels("leetcode");
    }

    public static String reverseVowels(String leetcode) {

        int l=0,r=leetcode.length()-1;
        while (l < r) {
            if (isVowels(leetcode.charAt(l))){
                if (isVowels(leetcode.charAt(r))){

                }
            }
        }
        return null;
    }

    private static boolean isVowels(char c){
        int[] vowels = {'a','e','i','o','u'};
        for (int i = 0; i < vowels.length; i++) {
            if (c == vowels[i]) {
                return true;
            }
        }
        return false;
    }

}
