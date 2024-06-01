package org.example.f30.day38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Number0139 {
    public static void main(String[] args) {
        String s = "applepenapple";
        ArrayList<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");

        Number0139 t = new Number0139();
        boolean b = t.wordBreak(s, wordDict);
        System.out.println(b);
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i && !dp[i]; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }

        return dp[n];
    }
}
