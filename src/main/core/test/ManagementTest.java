package main.core.test;
import main.core.Management;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ManagementTest {
    @Test
    public void testaskNumber() {
    Management management = new main.core.Management();
    int actualaskNumberResult = management.askNumber();
    assertEquals(0, actualaskNumberResult);
    }
}
