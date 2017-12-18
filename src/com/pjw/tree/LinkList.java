package com.pjw.tree;


public class LinkList<T> {
    private class Node{
        private T data;
        private Node next;
        public Node(){

        }

        public Node(T data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    private Node header;
    private Node tail;
    private int size;

    public LinkList(){
        header=null;
        tail=null;
    }

    public LinkList(T element){
        header=new Node(element,null);
        tail=header;
        size++;
    }

    public int length(){
        return size;
    }

    public T get(int index){
        Node node=getNodeByIndex(index);
        if (node!=null){
            return node.data;
        }
        return null;
    }

    private Node getNodeByIndex(int index){
        if (index<0 || index>size-1){
            throw new IndexOutOfBoundsException("linklist out of bounds "+size+";index:"+index);
        }
        Node current=header;
        for (int i=0;i<size && current!=null ;i++,current=current.next){
            if (i==index){
                return current;
            }
        }

        return null;
    }
}
