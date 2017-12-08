package cpm.pjw.sort;

/**
 * 插入排序
 * 平均O(n^2),最好O(n),最坏O(n^2);空间复杂度O(1);稳定;简单
 * @author pu
 *
 */
public class InsertSort {

    public static void sort(int[] array){
        if (array==null || array.length<=1){
            return;
        }
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int position=i;
            for(int j=i-1;j>=0;j--){
                if (array[j]>key){
                    array[j+1]=array[j];
                    position--;
                }else
                    break;
            }

            array[position]=key;
        }
    }
}
