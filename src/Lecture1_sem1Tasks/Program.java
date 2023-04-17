package Lecture1_sem1Tasks;

import java.util.Scanner;
public class Program {

        public static void main(String[] args) {
            System.out.println("Введите номер задачи или 0 для завершения программы: ");
            switch (intcheck()) {
                case 1 -> task1(); /*case 2 -> task2(); case 3 -> task3(); case 4 -> task4();
                case 5 -> task5(); case 6 -> task6(); case 7 -> task7();*/
                default -> System.exit(0);
            }
        }
        public static int intcheck(){
            Scanner sc = new Scanner(System.in);

            while(!sc.hasNextInt()) sc.next();
            return sc.nextInt();
        }
        static void task1() {
            /* 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n) */
            System.out.println("Введите число: "); int num = intcheck();
            int result = num * (num + 1) / 2;
            System.out.println("сумма чисел от 1 до n равна: " + result);
        }
}
