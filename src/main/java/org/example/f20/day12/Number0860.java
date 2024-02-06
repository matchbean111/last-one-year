package org.example.f20.day12;

import java.util.HashMap;

public class Number0860 {
    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        Number0860 t = new Number0860();
        System.out.println(t.lemonadeChange(bills));
    }

    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }
            if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                ten++;
                five--;
            }
            if (bill == 20) {
                if (five > 0 && ten > 0) {
                    ten--;
                    five--;
                    twenty++;
                } else if (five >= 3) {
                    five -= 3;
                    twenty++;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
