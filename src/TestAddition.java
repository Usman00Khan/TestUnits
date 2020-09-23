import org.junit.Assert;
import org.junit.Test;

public class TestAddition {
    @Test
    public void testAdd(){
        Addition c = new Addition();
        float a = 5;
        float b = 6;
        float exp = 11;
        float actual = c.operate(a, b);

        System.out.println("Sum test running");
        Assert.assertEquals(exp, actual,0.00001);
    }
}
