package cpm.pjw.sort;

public class QuikSort {

    public static void sort(int[] array,int low,int hight){
        if (low>hight)
            return;
        int index=partition(array,low,hight);
        sort(array,low,index-1);
        sort(array,index+1,hight);
    }

    public static int partition(int[] arr,int low,int hight){
        int rand=(int)(Math.random()*(hight-low))+low;
        int key=arr[rand];
        if (rand!=low){
            arr[rand]=arr[low];
        }

        while (low<hight){
            while (low<hight && arr[hight]>=key)
                hight--;
            arr[low]=arr[hight];
            while (low<hight && arr[low]<=key)
                low++;
            arr[hight]=arr[low];

        }
        arr[hight]=key;
        return hight;

    }


}
