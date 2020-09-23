import org.junit.Assert;
import org.junit.Test;

public class TestMultiplication {
    Multiplication m = new Multiplication();

    @Test
    public void testMul() {
        float a = 5;
        float b = 4;
        float expected = 20;
        System.out.println("Normal Multiplication test running");
        Assert.assertEquals(expected, m.operate(a, b), 0.0001);
    }

    @Test
    public void testMulWithLargeNumber() {
        float a = 10000000;
        float b = 10000000;
        float actual = m.operate(a, b);
        System.out.println("Large Number Multiplication test running");
        float expected = (float) 1.0E14;
        Assert.assertEquals(expected, actual, 0.001);
    }
}
