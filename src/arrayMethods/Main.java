package arrayMethods;

/**
 * Created by Andriy on 29.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];

        UtilsArray.setArray(arr1);
        System.out.println("Create Array");
        UtilsArray.showArray(arr1);

        System.out.println("Sorts array bubble");
        UtilsArray.bubbleSort(arr1);
        UtilsArray.showArray(arr1);

        UtilsArray.setArray(arr2);
        System.out.println("Create Array");
        UtilsArray.showArray(arr2);

        System.out.println("Sorts array Select");
        UtilsArray.selectSort(arr2);
        UtilsArray.showArray(arr2);

        UtilsArray.setArray(arr3);
        System.out.println("Create Array");
        UtilsArray.showArray(arr3);

        System.out.println("Sorts array Insert");
        UtilsArray.insertSort(arr3);
        UtilsArray.showArray(arr3);

    }
}
