package cpm.pjw.sort;

public class BubbleSort{

    public static void sort(int[] array){
        int i,j;
        for (i=0;i<array.length;i++){
            for (j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                   swap(array,i,j);
                }
            }
        }
    }

    private static void swap(int[] arr,int index1,int index2){

        /*arr[index1]=arr[index1]^arr[index2];
        arr[index2]=arr[index1]^arr[index2];
        arr[index1]=arr[index1]^arr[index2];*/
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
