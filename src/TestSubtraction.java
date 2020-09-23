import org.junit.Assert;
import org.junit.Test;

public class TestSubtraction {
    Subtraction s = new Subtraction();
    @Test
    public void testDiff() {
        float a = 5;
        float b = 6;
        float exp = -1;
        float actual = s.operate(a, b);

        System.out.println("Subtraction test is running");
        Assert.assertEquals(exp, actual,0.00001);


    }
}
