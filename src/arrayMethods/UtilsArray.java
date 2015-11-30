package arrayMethods;
/**
 * Created by Administrator on 27.11.2015.
 */
public class UtilsArray {


    public static int[] setArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*100);
        }
        return arr;
    }

    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length -1; j++){
                if (arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void selectSort(int [] arr){
        int min = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            min = arr[i];
            index = i;
            for (int j = i+1; j < arr.length; j++){

                if (min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            if (arr[i] != arr[index]) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }

    }

    public static void insertSort (int[] arr){
        int j, temp;
        for(int i = 0; i < arr.length; i++){
            temp = arr[i];
            for (j = i-1; j >=0 && arr[j] > temp; j-- ){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }

    }

}
