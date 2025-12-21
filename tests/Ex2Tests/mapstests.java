package Ex2Tests;

import assignments.Ex2.Map;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mapstests {
    @Test
    public void initArrtest() {
        Map maptest = new Map(1, 1, 0); // בנאי שקיים אצלך
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        maptest.init(arr);
        int[][] copy = maptest.getMap();
        copy[0][0] = 99;
        assertEquals(1, maptest.getPixel(0, 0)); // חייב להישאר 1

    }
}
