package Lecture1_sem1Tasks;/*
Task_2
Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
Входные данные
Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
Выходные данные
Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.
Sample Input 1:
3 2 4
Sample Output 1:
YES

 */
import java.util.Scanner;
public class TaskChocolateBar {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("n m k: ");
        String input_world = Sc.nextLine();
        String [] arr = input_world.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);
        System.out.println((k < m*n ) && ((k % m == 0) ||(k % n == 0)) ? "Yes" : "No");
    }
}
