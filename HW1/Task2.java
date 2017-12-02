package HW1;

import java.util.Scanner;

/**
 */
public class Task2 {

    /**
     * Функция деления
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double divide(double a, double b) {
        double c;
        c = Math.round((a / b) * 10000) / 10000.0d;
        System.out.println("Результат равен = " + c);
        return 0;
    }
    /**
     * Функция сложения
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double summ(double a, double b) {
        double c;
        c = Math.round((a + b) * 10000) / 10000.0d;
        System.out.println("Результат равен = " + c);
        return 0;
    }
    /**
     * Функция вычитания
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double substr(double a, double b) {
        double c;
        c = Math.round((a - b) * 10000) / 10000.0d;
        System.out.println("Результат равен = " + c);
        return 0;
    }
    /**
     * Функция умножения
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double mult(double a, double b) {
        double c;
        c = Math.round((a * b) * 10000) / 10000.0d;
        System.out.println("Результат равен = " + c);
        return 0;
    }

    public static void main(String[] args) {

        double n1, n2;
        String n3;

        System.out.println("Введите первое дробное число: ");
        Scanner s1 = new Scanner(System.in);
        n1 = s1.nextDouble();

        System.out.println("Введите второе дробное число: ");
        Scanner s2 = new Scanner(System.in);
        n2 = s2.nextDouble();

        System.out.println("Введите действие +, -, *, /: ");
        Scanner s3 = new Scanner(System.in);
        n3 = s3.nextLine();

        if (n3.equals("/")) {
            divide(n1, n2);
        } else if (n3.equals("*")){
            mult(n1, n2);
        } else if (n3.equals("+")){
            summ(n1, n2);
        } else if (n3.equals("-")){
            substr (n1, n2);
        }


    }

}
