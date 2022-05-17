package sparta.com.mc.sorters;

class SortSorted {

  int[] sortTwo(int[] firstArray, int[] secondArray) {

    int combinedLength = firstArray.length + secondArray.length;
    int[] combinedArray = new int[combinedLength];

    for (int i = 0, count1 = 0, count2 = 0; i < combinedLength; i++) {

      if (count2 == secondArray.length) {
        combinedArray[i] = firstArray[count1];
        count1++;
      } else if ((count1 == firstArray.length) || (firstArray[count1] > secondArray[count2])) {
        combinedArray[i] = secondArray[count2];
        count2++;
      } else {
        combinedArray[i] = firstArray[count1];
        count1++;
      }
    }

    return combinedArray;
  }
}
