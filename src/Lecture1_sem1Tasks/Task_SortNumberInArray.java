package Lecture1_sem1Tasks;

import java.util.Arrays;

public class Task_SortNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 3, 2, 4, 3, 5, 3, 3}; //out 1 2 4 5 3,3,3,3,3
        int val = 3;//sorted number
        int count = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != val) {
                arr[count++] = arr[i];
            }
        while (count < arr.length) {
            arr[count++] = val;
        }
        System.out.println(Arrays.toString(arr));
    }
}

