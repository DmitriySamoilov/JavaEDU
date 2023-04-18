package Sem2_Tasks;
/* Task_5
Вводится строка, определите, каких символов в ней больше: цифр или букв?
Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим.
Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
Если же их равное количество, то выведите слово "Equal".
Sample Input:
34Hi56
Sample Output:
Digit
*/
public class Task5 {
    public static void main(String[] args) {
        String text = "34Hi56";
        char [] arr_ch = text.toCharArray();
        int d = 0, l = 0;
        for (char _ch : arr_ch){
            if(Character.isDigit(_ch)) d++;
            if(Character.isAlphabetic(_ch)) l++;
        }
        if (d==l) System.out.println("Equal");
        else System.out.println(d > l  ? "Digit" : "Letters");
        }
}
