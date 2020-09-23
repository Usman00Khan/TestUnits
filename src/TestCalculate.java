import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
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
        int a = 5;
        int b = 6;
        int exp = 11;
        int actual = c.sum(a, b);

        System.out.println("Sum test running");
        Assert.assertEquals(exp, actual);


    }

    @Test
    public void testDiff() {
        Calculate c = new Calculate();
        int a = 5;
        int b = 6;
        int exp = -1;
        int actual = c.diff(a, b);

        System.out.println("Difference test is running");
        Assert.assertEquals(exp, actual);


    }

}
