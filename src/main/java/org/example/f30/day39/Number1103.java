package org.example.f30.day39;

public class Number1103 {
    public static void main(String[] args) {
        Number1103 t = new Number1103();
        int candies = 7, num_people = 4;
        int[] ints = t.distributeCandies(candies, num_people);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int index = 0;
        while (candies > 0) {
            result[index % num_people] += Math.min(index + 1, candies);
            candies -= Math.min(candies, index + 1);
            index += 1;
        }
        return result;

    }
}
