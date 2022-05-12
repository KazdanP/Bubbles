import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class BubblesCombinedTest {

    @Test
    void combinedTest() {
        int[] firstArray = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 6, 8, 8, 9, 9, 34};
        int[] secondArray = {3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 8, 9};

        int[] actualArray = Bubbles.doubleBubble(firstArray, secondArray);
        int[] expectedArray = {1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5,
                5, 5, 5, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 34};

        assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    void combinedTestTwo() {
        int[] firstArray = {1, 3, 5, 7, 9};
        int[] secondArray = {2, 4, 6, 8};

        int[] actualArray = Bubbles.doubleBubble(firstArray, secondArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    void combinedTestThree() {
        int[] firstArray = {1, 4, 7, 9, 13, 16, 18};
        int[] secondArray = {3, 5, 7, 8, 10, 11, 14, 17};

        int[] actualArray = Bubbles.doubleBubble(firstArray, secondArray);
        int[] expectedArray = {1, 3, 4, 5, 7, 7, 8, 9, 10, 11, 13, 14, 16, 17, 18};

        assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    void combinedTestFour() {
        int[] firstArray = {};
        int[] secondArray = {};

        int[] actualArray = Bubbles.doubleBubble(firstArray, secondArray);
        int[] expectedArray = {};

        assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    void combinedTestFive() {
        int[] firstArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] secondArray = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};

        int[] actualArray = Bubbles.doubleBubble(firstArray, secondArray);
        int[] expectedArray = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95};

        assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    void combinedTestSix() {
        int[] firstArray = {1, 2};
        int[] secondArray = {3, 4, 5, 6, 7, 8, 9, 10, 11};

        int[] actualArray = Bubbles.doubleBubble(firstArray, secondArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    void combinedTestSeven() {
        int[] firstArray = {3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] secondArray = {1, 2};

        int[] actualArray = Bubbles.doubleBubble(firstArray, secondArray);
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        assertThat(actualArray).isEqualTo(expectedArray);
    }
}
