package org.example.easy;

public class N1769 {
    public static void main(String[] args) {
        N1769 t = new N1769();
        String boxes = "110";
        int[] res = t.minOperations(boxes);
        for (int n : res) {
            System.out.println(n);
        }
    }

    public int[] minOperations(String boxes) {

        char[] cs = boxes.toCharArray();
        int n = cs.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int sm = 0;
            for (int j = 0; j < n; j++) {
                if (cs[j] == '1') {
                    sm += Math.abs(j - i);
                }
            }
            res[i] = sm;
        }

        return res;
    }
}
