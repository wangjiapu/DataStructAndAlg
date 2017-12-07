package com.pjw.tree;


import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

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

        public Object getData() {
            return data;
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


    /**
     * return node's parent
     * @param node
     * @return
     */
    public TreeNode getParent(TreeNode node){
        if (node==null)
            return null;
        return parent(getRoot(),node);
    }

    private TreeNode parent(TreeNode root,TreeNode node){
        if (root==null){
            return null;
        }
        if (root.left==node ||root.right==node)
            return root;
        parent(root.left,node);
        parent(root.right,node);
        return null;
    }


    public TreeNode rightChild(TreeNode node){
        if (node==null){
            throw new RuntimeException("treeNode is null ");
        }
        return node.right;
    }
    /**
     * Preorder traversal
     * @return
     */
    public List<TreeNode> preIterator(){
        if (isEmpty())
            throw new RuntimeException("tree is null ");
        return preIterator(getRoot());
    }

    private List<TreeNode> preIterator(TreeNode node){
        List<TreeNode> list=new ArrayList<>();
        list.add(node);
        if (node.left!=null){
            list.addAll(preIterator(node.left));
        }
        if (node.right!=null){
            list.addAll(preIterator(node.right));
        }
        return list;
    }




}
