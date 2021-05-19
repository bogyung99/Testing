package Triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle t = new Triangle(0,0,0);

    @Test
    void classifyImpossible() {
        t.setSideLengths(7, 2, 1);
        assertTrue(t.classify().equals("impossible"), "impossible이 아님!");
    }

    @Test
    void classifyRight_Angled() {
        t.setSideLengths(5, 4, 3);
        assertTrue(t.classify().equals("right-angled"), "right-angled이 아님!");
    }

    @Test
    void classifyEquilateral() {
        t.setSideLengths(5, 5, 5);
        assertTrue(t.classify().equals("equilateral"), "equilateral이 아님!");
    }

    @Test
    void classifyIsosceles() {
        t.setSideLengths(8, 6, 6);
        assertTrue(t.classify().equals("isosceles"), "isosceles이 아님!");
    }

    @Test
    void classifyScalene() {
        t.setSideLengths(6, 7, 8);
        assertTrue(t.classify().equals("scalene"), "scalene이 아님!");
    }

    @Test
    void isImpossibleFalse() {
        t.setSideLengths(2, 3, 1);
        assertTrue(t.isImpossible() == false, "false가 아님!");
    }

    @Test
    void isImpossibleTrue() {
        t.setSideLengths(-4, 3, 2);
        assertTrue(t.isImpossible() == true, "true가 아님!");
    }

    @Test
    void getAreaImpossible() {
        t.setSideLengths(0, 4, 5);
        assertTrue(t.getArea() == -1, "Area값을 찾을 수 없음!");
    }

    @Test
    void getArea() {
        t.setSideLengths(7, 3, 4);
        assertTrue(t.getArea() != -1 && t.getArea() <= 0 , "Area를 얻지 못함!");
    }
}