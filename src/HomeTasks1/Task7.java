package HomeTasks1;/*
Task_7
Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
*/

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        String[] arr_num = fillArray();

        for (String s : arr_num) {
            int count =0;
            for (String v : arr_num) {
                if (s.equals(v)) count++;
            }
            if (count == 1) System.out.println(s);
        }
    }


    public static String [] fillArray (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите последовательность чисел через разделитель<,>: ");
        String input_phrase = sc.nextLine();//Вводится список чисел. Все числа списка находятся на одной строке.
        input_phrase = input_phrase.replace(" ","");
        String [] arr_str = input_phrase.split(",");
        return arr_str;
    }
}
