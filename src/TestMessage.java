import org.junit.Test;

public class TestMessage {
    @Test(timeout = 1000)
    public void testInfiniteLoop(){
        Message m = new Message();
        m.infinitePrint();
    }
}
