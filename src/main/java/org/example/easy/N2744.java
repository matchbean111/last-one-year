package org.example.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class N2744 {
    public static void main(String[] args) {
        N2744 t = new N2744();

        String[] words = {"cd","ac","dc","ca","zz"};

        int res =t.maximumNumberOfStringPairs(words);
        System.out.println(res);
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        int n  = words.length;
        // for (int i=0;i<n;i++) {
        //     for (int j=i+1;j<n;j++) {
        //         if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
        //             ans++;
        //         }
        //     }
        // }
        Set<Integer> seen = new HashSet<>();
        for (int i=0;i<n;i++) {
            if (seen.contains(words[i].charAt(1) * 100 + words[i].charAt(0))){
                ++ans;
            }
            seen.add(words[i].charAt(0)*100 + words[i].charAt(1));
        }

        return ans;
    }
}
