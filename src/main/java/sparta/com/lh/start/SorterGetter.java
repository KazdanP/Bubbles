package sparta.com.lh.start;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sparta.com.lh.exceptions.SorterLoaderException;
import sparta.com.lh.interfaces.AnSorter;
import sparta.com.lh.sorters.*;

public class SorterFactory {

  private static final Logger logger = LogManager.getLogger("Sorter Factory");

  public static AnSorter getSorter(int choice) throws SorterLoaderException {
    AnSorter sorter;
    switch (choice) {
      case 1:
        logger.info("Bubble Sort Selected");
        return new BubblesSorter();
      case 2:
        logger.info("Merge Sort Selected");
        return new MergerineSorter();
      case 3:
        logger.info("Binary Sort Tree Selected");
        return new TreetSorter();
      default:
        logger.fatal("Selection Out of Bounds");
        throw new SorterLoaderException("Invalid Selection: '" + choice + "'");
    }
  }

}
