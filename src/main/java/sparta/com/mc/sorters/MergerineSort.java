package sparta.com.mc.sorters;

import sparta.com.mc.interfaces.AnSorter;

public class MergerineSort implements AnSorter {

  @Override
  public int[] sort(int[] toSort) {
    if (toSort.length < 1) { return toSort; }

    int toSortLength = toSort.length;

    // Split array into smaller, single length arrays
    int[][] splitArray = new int[toSortLength][1];

    for (int i = 0; i < toSortLength; i++) { splitArray[i][0] = toSort[i]; }

    return mergeSort(splitArray);
  }


  //TODO Rewrite this recursion to work with 1k length array
  private int[] mergeSort(int[][] inArray) {

    SortSorted sorty = new SortSorted();

    int arrayLength = inArray.length;

    if (arrayLength < 2) { return inArray[0]; }

    if (arrayLength == 3) {
      int[] anotherArray = sorty.sortTwo(inArray[0], inArray[1]);
      return sorty.sortTwo(anotherArray, inArray[2]);
    }

    int[][] newArray = new int[arrayLength / 2][];

    for (int i = 0, j = 0; i < newArray.length; i++, j+=2) {
      newArray[i] = sorty.sortTwo(inArray[j], inArray[j+1]);
    }

    return mergeSort(newArray);

  }

}
