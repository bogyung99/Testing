package SubDateTest;

import SubDate.SubDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubDateTest  {

    private SubDate sd = new SubDate();

    @Test
    void testSubDate() throws Exception {
        if(sd == null){
            throw new Exception("일자 생성 실패");
        }
    }

    @Test
    void testGetYearDay(){
        assertEquals(0, sd.getYearDay(1));
        assertEquals(365, sd.getYearDay(2));

        assertEquals(365+365+365+366, sd.getYearDay(5));
    }

    @Test
    void testLeapYear(){
        assertTrue(sd.isLeapYear(0));
        assertFalse(sd.isLeapYear(1));
        assertTrue(sd.isLeapYear(4));

        assertTrue(sd.isLeapYear(1200));
        assertFalse(sd.isLeapYear(700));
    }

    @Test
    void testGetMonthDay(){
//        assertEquals(0, sd.getMonthDay(1));
//        assertEquals(31, sd.getMonthDay(2));

        assertEquals(31+28, sd.getMonthDay(3, false));
        assertEquals(31+29, sd.getMonthDay(3, true));
    }

    @Test
    void testGetTotalDay(){
        assertEquals(1, sd.getTotalDay("00010101"));
        assertEquals(366, sd.getTotalDay("00020101"));
    }

    @Test
    void testSubDateFinal(){
        assertEquals(1, sd.sub("20211231", "20220101"));
        assertEquals(31+28+30+31+14, sd.sub("20220101", "20220515"));
        assertEquals(31+29+30+31+14, sd.sub("20240101", "20240515"));
    }
}
