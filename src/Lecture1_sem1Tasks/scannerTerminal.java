package Lecture1_sem1Tasks;

import java.util.Scanner;
public class scannerTerminal {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("number: ");
            boolean check = iScanner.hasNextInt();
            System.out.println(check);
            int number = iScanner.nextInt();// nextLine - string, next - char?, nextInt - number
            System.out.printf("Привет, %d!", number);
            iScanner.close();
        }
    }

