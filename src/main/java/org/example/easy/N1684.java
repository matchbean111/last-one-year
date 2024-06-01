package org.example.easy;

public class N1684 {
    public static void main(String[] args) {
        N1684 t = new N1684();
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int countConsistentStrings = t.countConsistentStrings(allowed, words);
        System.out.println(countConsistentStrings);
    }

    public int countConsistentStrings(String allowed, String[] words) {
        // int ans = words.length;
        // int n = words.length;
        // for (int i = 0; i < n; i++) {
        // for (char c : words[i].toCharArray()) {
        // if (!allowed.contains(String.valueOf(c))) {
        // ans--;
        // break;
        // }
        // }
        // }
        // return ans;
        int mask = 0;
        for (int i = 0; i < allowed.length(); i++) {
            char c = allowed.charAt(i);
            mask |= 1 << (c - 'a');
        }

        int res = 0;
        for (String word : words) {
            int mask1 = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                mask1 |= 1 << (c - 'a');
            }

            if ((mask1 | mask) == mask) {
                res++;
            }
        }
        return res;
    }

}
