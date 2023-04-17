package HomeTasks1;/*
Task_6
Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов
 с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3

 */
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int arr_len = sc.nextInt();
        int [] arr_num = new int [arr_len];
        int arr_oddSum =0;
        for (int i = 0; i < arr_len; i++) {
            arr_num[i] = sc.nextInt();
            if (i % 2 == 0){
                arr_oddSum += arr_num[i];
            }
        }
        System.out.println(arr_oddSum);
        for (int i = 0; i < arr_len; i +=2) {
            System.out.println(arr_num[i]);
        }
    }
}
