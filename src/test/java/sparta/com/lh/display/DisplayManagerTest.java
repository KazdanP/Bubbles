package sparta.com.lh.display;

import org.junit.jupiter.api.Test;
import sparta.com.lh.interfaces.AnSorter;
import sparta.com.lh.sorters.*;

public class DisplayManagerTest {

  @Test
  void printBeforeBubbleSortTest() {
    AnSorter sorter = new BubblesSorter();
    int[] intsIWannaSort = {45, 654, 78, 234, 1, 1, 1, 12312, 43};

    DisplayManager.printBeforeSort(sorter, intsIWannaSort);

    DisplayManager.printResult(sorter, intsIWannaSort);
  }

  @Test
  void printBeforeMergeSortTest() {
    AnSorter sorter = new MergerineSorter();
    int[] intsIWannaSort = {45, 654, 78, 234, 1, 1, 1, 12312, 43};

    DisplayManager.printBeforeSort(sorter, intsIWannaSort);

    DisplayManager.printResult(sorter, intsIWannaSort);
  }

  @Test
  void displayChoicesTest() {
    DisplayManager.displaySortChoices();
  }
}
