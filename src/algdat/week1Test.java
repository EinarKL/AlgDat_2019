package algdat;

import static org.junit.jupiter.api.Assertions.*;

class week1Test {

    @org.junit.jupiter.api.Test
    void findMaximum() {
        int[] values = {9, 17, 11, 4, 8, 32, 64};
        int max_value = week1.findMaximum(values);

        assertEquals(64, max_value);
    }
}