package Week2.HW3;

import java.util.Scanner;

/**
 * 2. Поиск максимального элемента в массиве.
 * Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 * После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 */
public class Task2 {


    public static void main(String[] args) {
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
