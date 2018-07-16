import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    Main mainClass;

    @Before
    public void setUp() {
        mainClass = new Main();
    }

    @Test
    public void writeFile() {
        boolean res;
        System.out.println("Test 1");
        res = mainClass.writeFile("", "" );
        assertEquals(false, res);
        System.out.println("Test 2");
        res = mainClass.writeFile("/home/artyomv/test", "" );
        assertEquals(true, res);
        System.out.println("Test 3");
        res = mainClass.writeFile("/home/artyomv/t", "string" );
        assertEquals(false, res);
        System.out.println("Test 4");
        res = mainClass.writeFile("/home/artyomv/test", "string" );
        assertEquals(true, res);
    }
}