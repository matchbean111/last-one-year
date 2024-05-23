package org.example.easy;

public class N1720 {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        N1720 t = new N1720();
        for (int i : t.decode(encoded, first)) {
            System.out.println(i);
        }

    }

    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ans = new int[n + 1];


        // encoded[i] = arr[i] XOR arr[i + 1]
        ans[0] = first;
        for (int i = 1; i <= n; i++) {
            ans[i] = encoded[i - 1] ^ ans[i - 1];
        }

        return ans;
    }
}
