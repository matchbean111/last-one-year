package org.example.easy;

public class N2651 {
    public static void main(String[] args) {
        N2651 n2651 = new N2651();
        System.out.println(n2651.findDelayedArrivalTime(15, 5));
    }

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
