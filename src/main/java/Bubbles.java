public class Bubbles {

  public static int[] bubbleBubbles(int[] toSort) {

    int runCounter = 1;
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

        runCounter++;
      }
      //Checks if nothing has been swapped i.e. already in the correct order
      if (!swapped) {
        break;
      }
    }

    System.out.println("Times ran: " + runCounter);

    return toSort;
  }

  public static int[] doubleBubble(int[] firstArray, int[] secondArray) {

    int firstLength = firstArray.length;
    int secondLength = secondArray.length;
    int combinedLength = firstArray.length + secondArray.length;
    int[] combinedArray = new int[combinedLength];

    int firstCounter = 0;
    int secondCounter = 0;

    for (int i = 0; i < combinedLength; i++) {

      if (secondCounter == secondLength) {
        combinedArray[i] = firstArray[firstCounter];
        firstCounter++;
        continue;
      } else if (firstCounter == firstLength) {
        combinedArray[i] = secondArray[secondCounter];
        secondCounter++;
        continue;
      }

      int firstNumber = firstArray[firstCounter];
      int secondNumber = secondArray[secondCounter];

      if (firstNumber > secondNumber) {
        combinedArray[i] = secondNumber;
        secondCounter++;
      } else {
        combinedArray[i] = firstNumber;
        firstCounter++;
      }
    }

    return combinedArray;
  }

}
