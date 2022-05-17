package sparta.com.lh.display;

import sparta.com.lh.interfaces.AnSorter;
import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {

  public static ArrayList<String> getMenuItems() {
    return new ArrayList<>(Arrays.asList("BubblesSort", "MergerineSort", "TreetSort"));
  }

  public static void displaySortChoices() {
    System.out.println("Enter the number of the sorter you wish to choose: ");

    for (String sortType : getMenuItems()) {
      System.out.println((getMenuItems().indexOf(sortType) + 1) + " - " + sortType);
    }
  }

  public static void printBeforeSort(AnSorter sorter, int[] arrayToSort) {
    System.out.println("Sorting using the " + sorter);
    System.out.println("Before sorting: \n" + Arrays.toString(arrayToSort));
  }

  public static void printResult(AnSorter sorter, int[] arrayToSort) {
    long startTime = System.nanoTime();

    int[] sortedArray = sorter.sort(arrayToSort);
    long endTime = System.nanoTime();

    System.out.println("Sorted: \n" + Arrays.toString(sortedArray));

    System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
  }

}
