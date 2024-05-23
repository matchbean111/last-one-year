package org.example.easy;

public class N1491 {
    public static void main(String[] args) {
        N1491 t = new N1491();
    }

    public double average(int[] salary) {
        int sum=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            if (min > salary[i]) {
                min = salary[i];
            }
            if (max < salary[i]) {
                max = salary[i];
            }
        }
        return (sum - min - max) * 1.0 / salary.length - 2;
    }
}
