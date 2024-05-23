package org.example.easy;

import java.util.List;

public class N1773 {
    public static void main(String[] args) {
    }


    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (List<String> item : items) {
            String type = item.get(0);
            String color = item.get(1);
            String name = item.get(2);
            if (ruleKey.equals("type") && type.equals(ruleValue)) {
                ans++;
            }
            if (ruleKey.equals("color") && color.equals(ruleValue)) {
                ans++;
            }
            if (ruleKey.equals("name") && name.equals(ruleValue)) {
                ans++;
            }
        }
        return ans;
    }
}
