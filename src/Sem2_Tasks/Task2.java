package Sem2_Tasks;
/* Task_2
Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены
слова, которые написаны в газете.
Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
Sample Input:
а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:
7
5
*/
public class Task2 {
    public static void main(String[] args) {
        String text = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        char first_ch = 'а';
        char second_ch = 'в';
        String [] arr = text.split(" ");
        Integer count1 = 0;
        Integer count2 = 0;
        for (String item : arr){
            if (item.indexOf(first_ch) != -1) { count1 ++;}
            if (item.indexOf(second_ch) != -1) { count2 ++;}
        }
        System.out.println(count1.toString());
        System.out.println(count2.toString());
    }
}
