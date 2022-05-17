package sparta.com.mc.sorters;

class SortSorted {

  int[] sortTwo(int[] firstArray, int[] secondArray) {

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
}
