package org.example.f30.day38;

public class Number0495 {
    public static void main(String[] args) {
        int[] timeSeries = {1,4};
        int duration = 2;
        Number0495 t = new Number0495();
        int poisonedDuration = t.findPoisonedDuration(timeSeries, duration);
        System.out.println(poisonedDuration);
    }


    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            int gap = timeSeries[i] - timeSeries[i - 1];
            if (gap >= duration) {
                res += duration;
            } else {
                res += gap;
            }
        }
        res += duration;
        return res;
    }
}
