package sparta.com.mc.sorters;

import sparta.com.mc.interfaces.AnSorter;

public class TreetSort implements AnSorter {

  @Override
  public int[] sort(int[] sortThis) { return new int[0]; }

  // Puts array into tree
  private void treeThis(int[] treeThisArray) {

    //First element in array is root node
    int root = treeThisArray[0];

    //initialising as -1 to indicate null
    int leftNode = -1;
    int rightNode = -1;


  }

  // Reads items in tree
  private void treeversal(int[] arrayToTraverse) {


  }
}

class TreetNode {

  boolean isRoot;
  int parent;
  int leftChild;
  int rightChild;

}
