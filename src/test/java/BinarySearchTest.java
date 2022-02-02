import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void test01() {
        int[] test = {1, 4, 5, 7, 8};
        assertEquals(2, BinarySearch.binSearchIterative(test,5));
    }

    @Test
    public void test02() {
        int[] test = {1, 4, 5, 7, 8};
        assertEquals(-1, BinarySearch.binSearchIterative(test,3));
    }

    @Test
    public void test03() {
        int[] test = {1, 4, 5, 7, 8};
        assertEquals(0, BinarySearch.binSearchIterative(test,1));
    }

    @Test
    public void test04() {
        int[] test = {1, 4, 5, 7, 8};
        assertEquals(4, BinarySearch.binSearchIterative(test,8));
    }

    @Test
    public void test05() {
        int[] test = {1, 3, 4, 5, 7, 8};
        assertEquals(5, BinarySearch.binSearchIterative(test,8));
    }
}
