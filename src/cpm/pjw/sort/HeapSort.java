package cpm.pjw.sort;

public class HeapSort {

    public static void sort(int[] array){
        if (array==null || array.length<=1)
            return;

        buildMaxHeap(array);

    }

    private static void buildMaxHeap(int[] array) {
        int half=array.length/2;
        for (int i=half;i>=0;i++){
            maxHeap(array,array.length,i);
        }
    }

    private static void maxHeap(int[] array, int length, int i) {


    }

    private static void swap(int[] arr,int index1,int index2){
        if (index1==index2){
            return;
        }
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
