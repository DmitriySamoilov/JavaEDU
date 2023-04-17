package HomeTasks1;//Реализовать простой калькулятор
//Минимум -- > Условия + Цикл
//Введите число
//Введите число
//Выберите операцию
//1 - сложить
//2 - умножить
import java.util.Scanner;
public class Task3_SimpleCalc {
    public static void main(String[] args) {
        boolean flag =true;
        System.out.println("Вас приветсвует ИИ Calc1.");
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите первое число:");
            double firstNum = sc.nextDouble();
            System.out.print("Введите второе число:");
            double secondNum = sc.nextDouble();
            System.out.print("Введите операцию (+,-,/,*,q-выход:");
            String op = sc.next();
            switch (op) {
                case "+" -> System.out.printf("%.2f + %.2f = %.2f\n", firstNum, secondNum, firstNum + secondNum);
                case "-" -> System.out.printf("%.2f - %.2f = %.2f\n", firstNum, secondNum, firstNum - secondNum);
                case "*" -> System.out.printf("%.2f * %.2f = %.2f\n", firstNum, secondNum, firstNum * secondNum);
                case "/" -> System.out.printf("%.2f / %.2f = %.2f\n", firstNum, secondNum, firstNum / secondNum);
                case "q" -> flag = false;
                default -> System.out.println("Неизвестная операция");
            }
        }
        System.out.println("Работа ИИ Calc1 завершена.");
    }
}
