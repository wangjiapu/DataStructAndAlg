package cpm.pjw.sort;

public class BubbleSort{

    public static void sort(int[] array){
        int i,j;
        for (i=0;i<array.length;i++){
            for (j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    array[i]=array[i]^array[j];
                    array[j]=array[i]^array[j];
                    array[i]=array[i]^array[j];
                }
            }
        }
    }
}
