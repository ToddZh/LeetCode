package algorithm;
import java.util.Arrays;


public class sort
{
    private static final int[] NUMBERS =
            {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > temp; j--) {
                //将大于temp的值整体后移一个单位
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        System.out.println(Arrays.toString(array) + " insertSort");
    }

    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            int temp;
            for(int j = 0; j < array.length - 1 - i;j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array) + " bubbleSort");

    }

    public static void selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int min = array[i];
            int index = i;
            for (int j=i;j<array.length;j++){
                if (min >= array[j]){
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        System.out.println(Arrays.toString(array) + "selectionSort");
    }


    public static void main(String[] args) {
        selectionSort(NUMBERS);
    }
}