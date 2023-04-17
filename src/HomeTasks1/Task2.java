package HomeTasks1;

//Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            if (checkNum(i)) System.out.printf("%d\n",i);
        }
    }
    public static boolean checkNum(int n){
        boolean check = true;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
