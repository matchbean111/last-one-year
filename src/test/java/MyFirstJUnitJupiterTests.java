import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyFirstJUnitJupiterTests {

    int[][] matrix;

    @BeforeEach
    public void beforeEach() {
        matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    }

    @Test
    public void testPrintMatrix() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }
    }

    @Test
    public void testPrintMatrix2() {

    }
}
