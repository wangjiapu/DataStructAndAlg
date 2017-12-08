import com.pjw.tree.TwoLinkBinTree;
import cpm.pjw.sort.InsertSort;

import java.util.List;

public class Test {
    public static void main(String[] args) {

      // testTree();
       testSort();
    }



    private static void testSort() {
        int[] array = { 3, -1, 0, -8, 2, 1 ,111,854,124,66,66,44,-8,2};
        InsertSort.sort(array);
        printArray(array);
    }




    private static void testTree() {

        TwoLinkBinTree<String> tree=new TwoLinkBinTree<>("9999");
        tree.addNode(tree.getRoot(),"8888",true);
        tree.addNode(tree.getRoot(),"7777",false);
        tree.addNode(tree.rightChild(tree.getRoot()),"6666",true);
        tree.addNode(tree.rightChild(tree.getRoot()),"5555",false);
        List<TwoLinkBinTree.TreeNode> list=tree.preIterator();
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i).getData());
        }
        TwoLinkBinTree.TreeNode node=tree.rightChild(tree.rightChild(tree.getRoot()));

        System.out.println(tree.getParent(node).getData());
    }

    private static void printArray(int[] array) {
        int len=array.length;
        for (int i=0;i<len;i++){
            if (i==len-1){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i]+",");
        }
    }


}
