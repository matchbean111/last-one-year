package org.example.easy;

public class N2520 {
    public static void main(String[] args) {
        N2520 t = new N2520();
        int i = t.countDigits(1248);
        System.out.println(i);
    }

    public int countDigits(int num) {
        int result = 0;
        int temp = num;
        while (num > 0) {
            int remainder = num % 10;
            if (temp % remainder == 0) {
                result++;
            }
            num = num / 10;

        }
        return result;
    }
}
