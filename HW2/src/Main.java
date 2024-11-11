import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // task 1
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        System.out.println(numberOfEvenElementsInArray(arr1));
        System.out.println(numberOfEvenElementsInArray(arr2));
        System.out.println(numberOfEvenElementsInArray(arr3));
        // task 2
        System.out.println(findDiffMaxAndMin(arr1));
        System.out.println(findDiffMaxAndMin(arr2));
        System.out.println(findDiffMaxAndMin(arr3));
        // task 3
        int[] arr4 = {2, 1, 2, 3, 4};
        int[] arr5 = {2, 2, 0, 0};
        System.out.println(neighboursIsZero(arr4) ? "Да" : "Нет");
        System.out.println(neighboursIsZero(arr5) ? "Да" : "Нет");
    }

    /**
     * 1. Написать метод, возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3
     * countEvens([1, 3, 5]) → 0
     */
    public static String numberOfEvenElementsInArray(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return String.format("countEvens(%s) -> %s", Arrays.toString(arr), count);
    }

    /**
     * 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
     * переданного не пустого массива.
     */
    public static String findDiffMaxAndMin(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        return String.format("countEvens(%s) -> разница между самым большим и самым маленьким элементами: %s", Arrays.toString(arr), max - min);
    }

    /**
     * 3. Написать функцию, возвращающую истину, если в переданном массиве есть два
     * соседних элемента, с нулевым значением.
     */
    public static boolean neighboursIsZero(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0 && arr[i + 1] == 0) {
                System.out.printf("В массиве countEvens(%s) есть соседние элементы нули: ", Arrays.toString(arr));
                return true;
            }
        }
        System.out.printf("В массиве countEvens(%s) есть соседние элементы нули: ", Arrays.toString(arr));
        return false;
    }
}