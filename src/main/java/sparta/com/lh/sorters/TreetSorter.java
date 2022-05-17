package sparta.com.lh.sorters;

import sparta.com.lh.interfaces.AnSorter;

public class TreetSorter implements AnSorter {

  @Override
  public String toString() {
    return "Tree Sort";
  }

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
