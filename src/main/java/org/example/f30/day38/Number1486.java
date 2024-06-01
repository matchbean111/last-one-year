package org.example.f30.day38;

public class Number1486 {
    public static void main(String[] args) {
        Number1486 t = new Number1486();
        int n = 10, start = 5;
        int i = t.xorOperation(n, start);
        System.out.println(i);
    }

    // Simulate the process, create an array nums and return the Bitwise XOR of all elements of it.
    public int xorOperation(int n, int start) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = start + 2 * i;
        }

        int xor = result[0];
        for (int i = 1; i < result.length; i++) {
            xor = xor ^ result[i];
        }
        return xor;
    }
}
