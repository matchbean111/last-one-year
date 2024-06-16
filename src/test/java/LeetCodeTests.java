import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

class LeetCodeTests {
    @Test
    public void transferBrackets() {
        String originStr = "matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]";
        String res = bracket(originStr);
        System.out.println(res);
    }

    @Test
    public void bitTest() {
        System.out.printf("%x", 0b0101 ^ 0b0010);
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
            System.out.println(nums[num - 1]);
        }
    }

    @Test
    public void testPrevMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] prevMatrix = new int[m + 1][n + 1];
        for (int[] value : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(value[j] + "\t ");
            }
            System.out.println();
        }
        System.out.println("============================");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prevMatrix[i][j] = prevMatrix[i - 1][j] + prevMatrix[i][j - 1] - prevMatrix[i - 1][j - 1]
                                   + matrix[i - 1][j - 1];
            }
        }

        for (int[] ints : prevMatrix) {
            for (int j = 0; j < prevMatrix[0].length; j++) {
                System.out.print(ints[j] + "\t ");
            }
            System.out.println();
        }

        System.out.println(prevMatrix[2][2] - prevMatrix[1][2]);
    }

    @Test
    public void testTriple() {
        int limit = 3;
        int n = 3;
        int count = 0;
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++) {
                if (n - i - j >= 0) {
                    System.out.printf("(%d, %d, %d)\n", i, j, n - i - j);
                    count++;
                }
            }
        }

        System.out.println(count);
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

    @Test
    public void testMatrixDiag() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int m = matrix.length;
        int n = matrix[0].length;

//        for (int i = m - 1; i >= 0; i--) {
//            System.out.print(" " + matrix[i][n - i - 1]);
//        }
//        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print("正对角线：" + matrix[i][i]);
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.println("反对角线：" + matrix[i][n - i - 1]);
        }
    }
}