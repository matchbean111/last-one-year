import java.util.HashMap;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

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

}
