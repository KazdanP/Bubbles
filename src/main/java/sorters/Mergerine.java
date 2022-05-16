import java.util.Arrays;

public class Sorter {

  public static int[] sortSorted(int[] firstArray, int[] secondArray) {

    int combinedLength = firstArray.length + secondArray.length;
    int[] combinedArray = new int[combinedLength];

    int firstCounter = 0;
    int secondCounter = 0;

    for (int i = 0; i < combinedLength; i++) {

      if (secondCounter == secondArray.length) {
        combinedArray[i] = firstArray[firstCounter];
        firstCounter++;
      } else if ((firstCounter == firstArray.length) || (firstArray[firstCounter] > secondArray[secondCounter])) {
        combinedArray[i] = secondArray[secondCounter];
        secondCounter++;
      } else {
        combinedArray[i] = firstArray[firstCounter];
        firstCounter++;
      }
    }

    return combinedArray;
  }

  public static int[] mergerine(int[] toSort) {
    if (toSort.length < 1) { return toSort; }

    int toSortLength = toSort.length;

    // Split array into smaller, single length arrays
    int[][] splitArray = new int[toSortLength][1];

    for (int i = 0; i < toSortLength; i++) { splitArray[i][0] = toSort[i]; }

    System.out.println(splitArray.length);

    int[] blah = mergeSort(splitArray);
    System.out.println(blah.length);

    return blah;
  }


  //TODO Rewrite this recursion to work with 1k length array
  public static int[] mergeSort(int[][] inArray) {

    int arrayLength = inArray.length;

    if (arrayLength < 2) { return inArray[0]; }

    if (arrayLength == 3) {
      int[] anotherArray = sortSorted(inArray[0], inArray[1]);
      return sortSorted(anotherArray, inArray[2]);
    }

    int[][] newArray = new int[arrayLength / 2][];

    for (int i = 0, j = 0; i < newArray.length; i++, j+=2) {
      newArray[i] = sortSorted(inArray[j], inArray[j+1]);
    }

    return mergeSort(newArray);

  }

}
