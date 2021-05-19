package DayCalcTest;

import DayCalc.DayCalc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayCalcTest {
    DayCalc dc = new DayCalc();

    @Test
    public void test1() {
        assertEquals('수' , dc.DayofDate(2021,5,19));
    }
}
