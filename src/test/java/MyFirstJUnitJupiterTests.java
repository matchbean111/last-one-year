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
}
