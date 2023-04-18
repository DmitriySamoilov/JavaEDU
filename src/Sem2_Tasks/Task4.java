package Sem2_Tasks;
/*Task_4
Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита.
Найдите, сколько раз в тексте встречается введённый символ в любом регистре.
Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.
Sample Input:
Good morning my dear friend. My fish.
m
Sample Output:
3
*/
public class Task4 {
    public static void main(String[] args) {
        String text = "Good morning my dear friend. My fish.";
        String letter = "m";
        int count = 0;
        for (int i = 0; i < text.length() ; i++) {

            if (letter.equalsIgnoreCase((String.valueOf(text.charAt(i))))){ count ++;}
        }
        System.out.println(count);
    }
}
