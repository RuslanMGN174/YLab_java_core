import org.junit.jupiter.api.Test;
import ru.knyazev.lesson1.task2.Main;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    public int[] initialArray() {
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9) + 1;
        }
        return array;
    }

    int[] array = initialArray();
    int begin = 0;
    int end = array.length - 1;
    int[] array2 = array.clone();

    @Test
    public void quickSort() {
        Main.quickSort(array, begin, end);
        Arrays.sort(array2);

        String actual = Arrays.toString(array);
        String expected = Arrays.toString(array2);

        assertEquals(expected, actual);
    }
}
