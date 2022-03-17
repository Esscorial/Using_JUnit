import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void plus() {

        final int x = 5;
        final int y = 2;
        final int expected = 7;

        final int result = calc.plus.apply(x, y);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void minus() {

        final int x = 2;
        final int y = 1;
        final int expected = 1;

        final int result = calc.minus.apply(x, y);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void multipy() {

        final int x = 4;
        final int y = 3;
        final int expected = 12;

        final int result = calc.multiply.apply(x, y);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void devide() {

        final int x = 30;
        final int y = 5;
        final int expected = 6;

        final int result = calc.divide.apply(x, y);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void pow() {

        Calculator calc = new Calculator();
        final int x = 2;
        final int expected = 4;

        final int result = calc.pow.apply(x);

        Assertions.assertEquals(expected, result);

    }

}

