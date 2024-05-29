package org.example.f30.day38;

import java.util.ArrayList;
import java.util.List;

public class Number2951 {
    public static void main(String[] args) {
        int[] mountain = {2, 4, 4};
        Number2951 t = new Number2951();
        for (Integer peak : t.findPeaks(mountain)) {
            System.out.println(peak);
        }

    }

    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<Integer>();
        int n = mountain.length;
        for (int i = 1; i < n - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }

        }
        return peaks;
    }
}
