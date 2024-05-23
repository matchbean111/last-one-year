import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyFirstJUnitJupiterTests {

    int[][] matrix;

    @BeforeEach
    public void beforeEach() {
        matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    }

    @Test
    public void testPrintMatrix() {

        for (int[] its : matrix) {
            for (int anInt : its) {
                System.out.print(anInt + "\t ");
            }
            System.out.println();
        }
    }

    @Test
    public void testPrintMatrix2() {

    }

    @Test
    public void testPermute() {
        int[] arr = {1,2,3};

    }
    private ArrayList<Integer> track = new ArrayList<>();


    private void backtrack(int[] arr, int start) {
        for (int i=0; i <arr.length;i++) {
            track.add(arr[i]);
            backtrack(arr, i+1);
            track.remove(i);
        }
    }

    @Test
    public void testPrintMatrix3() {
        int[][] mat = {{3,3,1,1}, {2,2,1,2,}, {1,1,1,2}};
        // 从上往下， 从左往右 simple 

        // 从上往下， 从右往左 simple
    }

    @Test
    public void t123() {
        System.getProperties().put(1,   2 );
        System.out.println(System.getProperties());
    }

    @Test
    public void testArray() {
        int[] nums = {1,2,3,4,5};
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        
        assertEquals(1, pq.poll());

    }
}
