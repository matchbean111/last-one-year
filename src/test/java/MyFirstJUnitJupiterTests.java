import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {
    List<List<Integer>> res = new LinkedList<>();
    List<Integer> track = new LinkedList<>();

    @Test
    void testHashMapContains() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);
        map.put(6, null);
        map.put(7, null);
        boolean containsKey = map.containsKey(5);
        System.out.println(containsKey);

    }

    @Test
    void testParseInt() {
        String s = "01";
        System.out.println(Integer.parseInt(s));
    }

    @Test
    void testStringBuilderMethods() {
        StringBuilder sb = new StringBuilder("10.101.233");
        sb.delete(sb.length() - "233".length() - 1,sb.length());
        System.out.println(sb.toString());
    }

    @Test
    void test() {
        System.out.println("Hello World!");
    }

    @Test
    void testBacktrack() {
        int[] nums = {1,2,3,4};

        backtrack(nums, 0);
        for (List<Integer> re : res) {
            for (int i = 0; i < re.size(); i++) {
                System.out.printf("%d ", nums[i]);
            }
            System.out.println();
        }
    }

    private void backtrack(int[] nums, int start) {
        int n = nums.length;
        if (track.size() >= 2) {
            res.add(new LinkedList<>(track));
        }

        for (int i = start; i < n; i++) {
            track.add(nums[i]);
            backtrack(nums,i+1);
            track.remove(track.size()-1);
        }
    }
}
