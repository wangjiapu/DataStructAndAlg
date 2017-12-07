import com.pjw.tree.TwoLinkBinTree;

import java.util.List;

public class Test {
    public static void main(String[] args) {
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
}
