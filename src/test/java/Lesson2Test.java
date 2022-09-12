import org.junit.jupiter.api.Test;
import ru.knyazev.lesson2.task3.Main;

import static org.junit.jupiter.api.Assertions.*;


public class Lesson2Test {

    @Test
    public void testFuzzySearch() {
        assertTrue(Main.fuzzySearch2("car", "ca6$$#_rtwheel")); // true
        assertTrue(Main.fuzzySearch2("cwhl", "cartwheel")); // true
        assertTrue(Main.fuzzySearch2("cwhee", "cartwheel")); // true
        assertTrue(Main.fuzzySearch2("cartwheel", "cartwheel")); // true
        assertFalse(Main.fuzzySearch2("cwheeel", "cartwheel")); // false
        assertFalse(Main.fuzzySearch2("lw", "cartwheel")); // false
    }
}
