import com.pjw.tree.TwoLinkBinTree;

public class Test {
    public static void main(String[] args) {
        TwoLinkBinTree<String> tree=new TwoLinkBinTree<>("9999");
        tree.addNode(tree.getRoot(),"8888",true);
        tree.addNode(tree.getRoot(),"7777",false);
    }
}
