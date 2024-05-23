package org.example.f30.day32;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Number0396 {
    public static void main(String[] args) throws IOException {
        Number0396 t = new Number0396();
        t.maxRotateFunction();
    }

    public int maxRotateFunction() throws IOException {
        File file = new File(".");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        List<String> strings = Files.readAllLines(Paths.get("data.txt"));
        String[] split = strings.get(0).split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }

        int f = 0, n = nums.length, numSum = Arrays.stream(nums).sum();
        for (int i = 0; i < n; i++) {
            f += i * nums[i];
        }
        int res = f;
        for (int i = n - 1; i > 0; i--) {
            f += numSum - n * nums[i];
            res = Math.max(res, f);
        }
        return res;
    }
}
