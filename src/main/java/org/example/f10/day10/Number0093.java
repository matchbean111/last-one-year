package org.example.f10.day10;

import java.util.ArrayList;
import java.util.List;

public class Number0093 {
    static List<List<String>> res = new ArrayList<>();
    List<String> track = new ArrayList<>();
    List<String> res1 = new ArrayList<>();

    public static void main(String[] args) {
        Number0093 t = new Number0093();
        String s = "010010";
        List<String> list = t.restoreIpAddresses(s);
        for (String is : list) {
            System.out.println(is);
        }

        for (List<String> ssss : res) {
            for (String s1 : ssss) {
                System.out.println(s1);
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0);
        res1 = transfer(res);
        return res1;
    }

    void backtrack(String s, int start) {
        if (track.size() == 4 && start >= s.length()) {
            res.add(new ArrayList<>(track));
        }

        for (int i = start; i < s.length(); i++) {
            if (!isLeagal(s, start, i)) {
                continue;
            }
            String str = s.substring(start, i + 1);
            track.add(str);

            backtrack(s, i + 1);

            track.remove(track.size() - 1);
        }
        // ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
    }

    private boolean isLeagal(String s, int start, int end) {
        if (end - start == 0) {
            return true;
        } else if (end - start == 1) {
            return s.charAt(start) != '0';
        } else if (end - start == 2) {
            if (s.charAt(start) == '0') {
                return false;
            }
            String str = s.substring(start, end + 1);
            int i = Integer.parseInt(str);
            return i < 256;
        } else {
            return false;
        }
    }

    private List<String> transfer(List<List<String>> list) {

        StringBuilder sb = new StringBuilder();
        for (List<String> list2 : list) {
            for (int i = 0; i < list2.size(); i++) {
                if (i < 3) {
                    sb.append(list2.get(i));
                    sb.append(".");
                } else {
                    sb.append(list2.get(i));
                }
            }
            res1.add(sb.toString());
            sb.delete(0, sb.length());
        }

        return res1;
    }


}
