package com.pjw.tree;

import java.util.Arrays;

public class SequenceStack<T> {

    private Object[] elementData;
    private int DEFAULT_SIZE=16;
    private int capacity;
    private int size;

    private int capacityIncrement=0;
    public SequenceStack(){
        capacity=DEFAULT_SIZE;
        elementData=new Object[capacity];
    }

    public SequenceStack(T element){
        this();
        elementData[0]=element;
        size++;
    }

    public SequenceStack(T element, int initSize){
        this.capacity=initSize;
        elementData=new Object[capacity];
        elementData[0]=element;
        size++;
    }


    public int length(){
        return size;
    }

    public void push(T element){
        ensureCapacity(size+1);
        elementData[size++]=element;
    }

    private void ensureCapacity(int i) {
        if (i>capacity){
            if (capacityIncrement>0){
                while (capacity<i){
                    capacity+=capacityIncrement;
                }
            }else{
                while (capacity<i){
                    capacity <<= 1;
                }
            }
            elementData= Arrays.copyOf(elementData,capacity);
        }
    }


    public T pop(){

        T oldValue =  (T) elementData[size-1];
         elementData[--size]=null;
         return oldValue;
    }

}
