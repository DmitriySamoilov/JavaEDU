package Lecture1_sem1Tasks;/*Task_1
Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
Программа должна вывести одно натуральное число.
Sample Input 1:
10
3
2
Sample Output 1:
8
*/
import java.util.Scanner;
public class TaskNail {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("h: ");
        int h = Sc.nextInt();
        System.out.print("a: ");
        int a = Sc.nextInt();
        System.out.print("b<a: ");
        int b = Sc.nextInt();
        int count = 1;
        if (h>a) {
            do {
                h = h - a + b;
                count++;
            }while (h > a);
        }
        System.out.println(count);
    }
}
