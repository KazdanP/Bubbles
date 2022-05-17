package sparta.com.mc.start;

import sparta.com.mc.exceptions.SorterLoaderException;
import sparta.com.mc.interfaces.AnSorter;
import sparta.com.mc.sorters.*;

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
        throw new SorterLoaderException();
    }

  }

}
