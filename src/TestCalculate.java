import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
    Calculate c = new Calculate();
    @Before
    public void beforeTest() {
        System.out.println("This runs before every Test.");
    }

    @After
    public void afterTest() {
        System.out.println("This runs After every Test.");
    }

    @Test
    public void testSum() {
        Calculate c = new Calculate();
        float a = 5;
        float b = 6;
        float exp = 11;
        float actual = c.sum(a, b);

        System.out.println("Sum test running");
        Assert.assertEquals(exp, actual,0.00001);


    }

    @Test
    public void testDiff() {
        float a = 5;
        float b = 6;
        float exp = -1;
        float actual = c.diff(a, b);

        System.out.println("Difference test is running");
        Assert.assertEquals(exp, actual,0.00001);


    }
    @Test
    public void testMul(){
        float a = 5;
        float b =4;
        float expected = 20;
        Assert.assertEquals(expected,c.mul(a,b),0.0001);
    }
    @Test
    public void testMulWithLargeNumber(){
        float a = 10000000;
        float b = 10000000;
        float actual = c.mul(a,b);
        System.out.println(actual);
        float expected = (float) 1.0E14;
        Assert.assertEquals(expected,actual,0.001);

    }
    @Test
    public void testDiv(){
        float a = 20;
        float b =4;
        float expected = 5;
        Assert.assertEquals(expected,c.div(a,b),0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivWhenDenZero(){
        float a = 20;
        float b = 0;
        float expected = 5;
        Assert.assertEquals(expected,c.div(a,b),0.0001);
    }
}
