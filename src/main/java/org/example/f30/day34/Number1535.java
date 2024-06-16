package org.example.f30.day34;

import java.util.LinkedList;

public class Number1535 {
    public static void main(String[] args) {
        Number1535 t = new Number1535();
        int[] arr = {2, 1, 3, 5, 4, 6, 7};
        int k = 2;
        int winner = t.getWinner(arr, k);
        System.out.println(winner);
    }

    public int getWinner(int[] arr, int k) {
        int ans = 0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }
        int i1 = list.poll();
        int i2 = list.poll();
        int curWin = 1;
        while (curWin < k) {

        }

        return ans;
    }

}
