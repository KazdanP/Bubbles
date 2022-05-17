package sparta.com.lh.start;

import sparta.com.lh.exceptions.SorterLoaderException;
import sparta.com.lh.interfaces.AnSorter;
import sparta.com.lh.sorters.*;

public class SorterFactory {

  public static AnSorter getSorter(int choice) throws SorterLoaderException {
    switch (choice) {
      case 1:
        return new BubblesSorter();
      case 2:
        return new MergerineSorter();
      case 3:
        return new TreetSorter();
      default:
        throw new SorterLoaderException("Invalid Sorter Choice: " + choice);
    }

  }

}
