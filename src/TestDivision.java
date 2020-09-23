import org.junit.Assert;
import org.junit.Test;

public class TestDivision {
    Division d = new Division();
    @Test
    public void testDiv(){
        float a = 20;
        float b =4;
        float expected = 5;
        System.out.println("Normal Division test running");
        Assert.assertEquals(expected,d.operate(a,b),0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivWhenDenZero(){
        float a = 20;
        float b = 0;
        float expected = 5;
        System.out.println("Zero Division test running");
        Assert.assertEquals(expected,d.operate(a,b),0.0001);
    }
}
