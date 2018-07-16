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
    public void writeToFile() {
        boolean res;
        System.out.println("Тест 1: пустой путь и строка");
        res = mainClass.writeToFile("", "" );
        assertEquals(false, res);
        System.out.println("Тест 1 пройден");
        System.out.println("Тест 2: верный путь");
        res = mainClass.writeToFile("/home/artyomv/test", "" );
        assertEquals(true, res);
        System.out.println("Тест 2 пройден");
        System.out.println("Тест 3: не верный путь");
        res = mainClass.writeToFile("/home/artyomv/t", "string" );
        assertEquals(false, res);
        System.out.println("Тест 3 пройден");
        System.out.println("Тест 4: верный путь и строка");
        res = mainClass.writeToFile("/home/artyomv/test", "string" );
        assertEquals(true, res);
        System.out.println("Тест 4 пройден");
    }
}