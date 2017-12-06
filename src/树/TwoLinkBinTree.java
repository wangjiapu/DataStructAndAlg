package 树;


public class TwoLinkBinTree<E> {
    public static class TreeNode{
        Object data;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}

        public TreeNode(Object data){
            this.data=data;
        }
        public TreeNode(Object data,TreeNode l,TreeNode r){
            this.data=data;
            this.left=l;
            this.right=r;
        }
    }

    private TreeNode root;

    /**
     * default twobinTree
     */
    public TwoLinkBinTree(){
        this.root=new TreeNode();
    }

    /**
     * The specified element is created
     * @param data rootData
     */
    public TwoLinkBinTree(E data){
        this.root=new TreeNode(data);
    }

    public TreeNode addNode(TreeNode parent,E data,boolean isLeft){
        if (parent==null)
            throw new RuntimeException("root is null don't add data");

        TreeNode newNode=new TreeNode(data);

        if (isLeft){
            if (parent.left!=null)
                throw new RuntimeException("leftchild is not null !!!");
            parent.left=newNode;

        }else{
            if (parent.right != null)
                throw new RuntimeException("rightchild is not null !!!");
            parent.right=newNode;
        }

        return newNode;
    }


    /**
     * @return rootData
     */
    public TreeNode getRoot() {
        if (isEmpty())
            throw new RuntimeException("tree is null ");
        return root;
    }

    /**
     * tree is null
     * @return rootdata is null
     */
    public boolean isEmpty(){
        return root.data == null;
    }
}
