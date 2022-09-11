import org.junit.jupiter.api.Test;
import ru.knyazev.lesson2.task3.Main;

import static org.junit.jupiter.api.Assertions.*;


public class Lesson2Test {

    @Test
    public void testFuzzySearch() {
        assertTrue(Main.fuzzySearch("car", "ca6$$#_rtwheel")); // true
        assertTrue(Main.fuzzySearch("cwhl", "cartwheel")); // true
        assertTrue(Main.fuzzySearch("cwhee", "cartwheel")); // true
        assertTrue(Main.fuzzySearch("cartwheel", "cartwheel")); // true
        assertFalse(Main.fuzzySearch("cwheeel", "cartwheel")); // false
        assertFalse(Main.fuzzySearch("lw", "cartwheel")); // false
    }
}
