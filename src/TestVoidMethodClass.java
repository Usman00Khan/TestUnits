import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class TestVoidMethodClass {
    private VoidMethodClass personList = new VoidMethodClass();

    @Before
    public void initialize() {
        personList.add("Usman");
        personList.add("Rahul");
        personList.add("Ankita");

    }

    @After
    public void destroy() {
        personList.removeAll();
    }

    @Test
    public void testSize() {
        int expected = 3;
        System.out.println("Person List size test running");
        Assert.assertEquals(expected, personList.size());
    }

    @Test
    public void testAddPerson() {
        personList.add("Krishna");
        int expected = 4;
        System.out.println("Add person test running");
        Assert.assertEquals(expected, personList.size());
    }

    @Test
    public void testRemovePersonWorking() {
        personList.remove("Ankita");
        int expected = 2;
        System.out.println("Remove existing person test running");
        Assert.assertEquals(expected, personList.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoverPersonExpection() {
        personList.remove("Krishna");
        int expected = 2;
        System.out.println("Remove non existing person test running");
        Assert.assertEquals(expected, personList.size());
    }


}
