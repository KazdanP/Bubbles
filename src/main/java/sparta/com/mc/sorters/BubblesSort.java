package sparta.com.mc.sorters;

import sparta.com.mc.interfaces.AnSorter;

public class BubblesSort implements AnSorter {

  @Override
  public int[] sort(int[] sortThis) {
    return bubbles(sortThis);
  }

  private int[] bubbles(int[] toSort) {

    boolean swapped;

    for (int j = 0; j <= toSort.length; j++) {

      swapped = false;

      for (int i = 0; i < toSort.length - 1 - j; i++) {
        int first = toSort[i];
        int second = toSort[i + 1];

        if (first > second) {
          toSort[i] = second;
          toSort[i + 1] = first;
          swapped = true;
        }

      }

      //Checks if nothing has been swapped i.e. already in the correct order
      if (!swapped) { break; }
    }

    return toSort;
  }
}
