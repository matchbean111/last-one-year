package org.example.f40.day40;

public class Number2938 {
    public static void main(String[] args) {
        Number2938 t = new Number2938();
        String s = "101";
        long l = t.minimumSteps(s);
        System.out.println(l);
    }

    /**
     * 1 <= n == s.length <= 105
     * s[i]: 0 或者 1
     *
     * @param s 黑白球
     * @return 次数
     */
    public long minimumSteps(String s) {
        /*
        "1":  0 次
        "10": 0次或者1次
        "101":
         */
        int n = s.length();


        long res = 0;


        return res;
    }
}
