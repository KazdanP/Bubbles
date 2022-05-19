package sparta.com.lh.sorters;

import sparta.com.lh.interfaces.AnSorter;

import java.util.Arrays;

public class MergerineSorter implements AnSorter {

  @Override
  public String toString() {
    return "Mergerine Sort";
  }

  @Override
  public int[] sort(int[] toSort) {
    if (toSort.length < 1) { return toSort; }

    int toSortLength = toSort.length;

    // Split array into smaller, single length arrays
    int[][] splitArray = new int[toSortLength][1];

    for (int i = 0; i < toSortLength; i++) { splitArray[i][0] = toSort[i]; }

    return mergeSort(splitArray);
  }

  private int[] mergeSort(int[][] inArray) {

    int arrayLength = inArray.length;

    if (arrayLength < 2) { return inArray[0]; }

    int[][] newArray;

    if (arrayLength % 2 == 1) {
      arrayLength -= 1;
      int[][] combinedArray = new int[arrayLength][];
      combinedArray[0] = SortSorted.sortTwo(inArray[0], inArray[1]);

      for (int i = 1; i < arrayLength; i++) {
        combinedArray[i] = inArray[i+1];
      }

      newArray = combinedArray;
    } else {
      newArray = new int[arrayLength / 2][];

      for (int i = 0, j = 0; i < newArray.length; i++, j+=2) {
        newArray[i] = SortSorted.sortTwo(inArray[j], inArray[j+1]);
      }
    }

    return mergeSort(newArray);
  }

}
