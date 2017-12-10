package Week2.HW3;

import java.util.Scanner;

/**
 * 3. Программа должна выполнять одно из заданий на выбор.
 * Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */
public class Task3 {

    /**
     * Функция деления
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double divide(double a, double b) {
        double c;
        //c = Math.round((a / b) * 10000) / 10000.0d;
        //System.out.println("Результат равен = " + c);
        c = a / b;
        System.out.printf("%.2f + %.2f = %.4f", a, b, c);
        return c;
    }
    /**
     * Функция сложения
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double summ(double a, double b) {
        double c;
        c = a + b;
        System.out.printf("%.2f + %.2f = %.4f", a, b, c);
        return c;
    }
    /**
     * Функция вычитания
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double substr(double a, double b) {
        double c;
        c = a - b;
        System.out.printf("%.2f - %.2f = %.4f", a, b, c);
        return c;
    }
    /**
     * Функция умножения
     * @param a - первое значение
     * @param b - второе значение
     * @return
     */
    public static double mult(double a, double b) {
        double c;
        c = a * b;
        System.out.printf("%.2f * %.2f = %.4f", a, b, c);
        return c;
    }


    public static void main(String[] args) {
        int n5;

        System.out.println("Введите значение на быбор. 1 - калькулятор, 2 - массив слов");
        Scanner s5 = new Scanner(System.in);
        n5 = s5.nextInt();

        if (n5 == 1){

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
        } else if (n5 == 2) {
            int n1;
            String n2, str;

            //String[] subStr;
            String delimeter; // Разделитель

            System.out.println("Введите размерность массива: ");
            Scanner s1 = new Scanner(System.in);
            n1 = s1.nextInt();

            String[] subStr = new String[n1];
            System.out.println("Массив размерностью " + n1 + " создан");

            System.out.println("Введите слова через пробел: ");
            Scanner s2 = new Scanner(System.in);
            n2 = s2.nextLine();

            str = n2;
            delimeter = " "; // Разделитель
            subStr = str.split(delimeter, n1);

            String tempStr;
            int max = 0;
            int bufmax = 0;

            for(int i = 0; i < subStr.length; i++) {
                tempStr = subStr[i];
                if (tempStr.length() > max){
                    max = tempStr.length();
                    bufmax = i;
                }
            }
            System.out.println("Самое длинное слово в масиве: " + subStr[bufmax]);
        }

    }
}
