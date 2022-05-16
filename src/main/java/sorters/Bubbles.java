package sorters;

public class Bubbles {

  public static int[] bubbles(int[] toSort) {

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
      if (!swapped) { break; }
    }

    System.out.println("Times ran: " + runCounter);

    return toSort;
  }
}
