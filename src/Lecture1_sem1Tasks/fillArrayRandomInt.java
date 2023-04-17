package Lecture1_sem1Tasks;

import java.util.Arrays;
import java.util.Random;

public class fillArrayRandomInt {
    public static void main(String[] args) {
        Random item = new Random();
        int minNum = 0;
        int maxNum =10;
        int [] arr = new int[item.nextInt(20,30)];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = item.nextInt(minNum,maxNum);
        }
        System.out.println(Arrays.toString(arr));
    }
}
