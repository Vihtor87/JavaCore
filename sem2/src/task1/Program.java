package task1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6,};

        System.out.println(Arrays.toString(addValue(a, 55)));
        System.out.println(Arrays.toString(addValue(a, 3,555)));

    }

    public static int[] addValue(int[] arr, int num) {
        int[] res = Arrays.copyOf(arr, arr.length + 1);
        res[res.length - 1] = num;
        return res;
    }

    public static int[] addValue(int[] arr, int index, int num) {
        if (!(index >= 0 && index <= arr.length)) {
            throw new RuntimeException("Индекс вне массива!");
        }
        else {
            int[] res = new int[arr.length + 1];
            System.arraycopy(arr, 0, res, 0, index);
            res[index] = num;
            System.arraycopy(arr, index, res, index + 1, arr.length - index);
//            res = new int[arr.length + 1];
//            int temp = 0;
//            for (int i = 0; i < res.length; i++) {
//                if (i == index) {
//                    res[i] = num;
//                    temp++;
//                } else {
//                    res[i] = arr[i - temp];
//                }
//            }
            return res;
        }
    }
}
