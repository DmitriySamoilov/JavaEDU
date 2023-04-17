package HomeTasks1;//1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int number = sc.nextInt();
        System.out.printf("%d -ое треугольного числа равно %d\n",number,trNum(number));
        System.out.printf("Факториал %d  равен  %d",number,factor(number));
    }
    public static int trNum(int n){
        return (int)((0.5 * n) * (n + 1));
    }
    public static int factor(int n) {
        if(n==1 || n==0)return 1;
        return n * factor(n-1);
    }
}
