package org.example.easy;

import java.util.Arrays;

public class N1652 {
    public static void main(String[] args) {
        N1652 t = new N1652();
        int[] code = {2,4,9,3};
        int k = -2;
        for (int decrypt : t.decrypt(code, k)) {
            System.out.println(decrypt);
        }
    }

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        
        
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int t = 0;        
                for (int j = 0; j < k; j++) {
                    t += code [(i + j + 1 + n) % n];
                }            
                // t += code[(i + 1 + n) % n] ... code[(i + k + n) % n]
                
                res[i] = t;
            }
        } else if (k < 0) {
            for (int i = 0; i < n; i++) {
                // t += code[(i - 1 + n) % n] ... code[(i -k + n) % n]
                int t = 0;
                
                for (int j = 0; j < -k; j++) {
                    t += code[(-j-1 +i+ n) % n];
                }
                res[i] = t;
            }
        } else {
            return res;
        }
        return res;
    }
}
