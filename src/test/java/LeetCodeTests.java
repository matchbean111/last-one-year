import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

class LeetCodeTests {
    @Test
    public void transferBrackets() {
        String originStr = "items = [[\"phone\",\"blue\",\"pixel\"],[\"computer\",\"silver\",\"lenovo\"],[\"phone\",\"gold\",\"iphone\"]], ruleKey = \"color\", ruleValue = \"silver\"";
        String res = bracket(originStr);
        System.out.println(res);
    }

    @Test
    public void bitTest() {
        System.out.printf("%", 0b0101 ^ 0b0010);
        System.out.println(0 ^ 0);
    }

    @Test
    public void priorityQueueTest() {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }

    @Test
    public void testArraySelfHash() {
        int[] nums = {4, 1, 5, 6, 8, 3, 2, 7};
        for (int num : nums) {
            System.out.println(nums[num -1]);
        }
    }

    private String bracket(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                sb.append('{');
            } else if (str.charAt(i) == ']') {
                sb.append('}');
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
