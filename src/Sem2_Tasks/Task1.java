package Sem2_Tasks;
/*Task_1
Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра.
Определите индексы первого и последнего её вхождения.
Sample Input:
4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
4
Sample Output:
0
28

*/
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        String text = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        char item = '4';
        int first_index = text.indexOf(item);
        int last_index = text.lastIndexOf(item);
        System.out.println(first_index);
        System.out.println(last_index);
        }


        }


