import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {
    @Test
    public void testSum(){
        Calculate c = new Calculate();
        int a =5;
        int b= 6;
        int exp = 11;

        int actual = c.sum(a,b);

        Assert.assertEquals(exp, actual);


    }
}
