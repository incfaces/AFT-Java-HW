package Week2.HW4;

/**
 * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 */
public class Task1 {

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rnd(-10, 10);
            System.out.println(numbers[i]);
        }
        int maxInd = 0;
        int max = -11;
        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max && numbers[i] < 0) {
                    max = numbers[i];
                    maxInd = i;
                }
            }

        int minInd = 0;
        int min = 11;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] < min && numbers[j] > 0) {
                min = numbers[j];
                minInd = j;
            }
        }
        //Меняем местами
        numbers[maxInd] = min;
        numbers[minInd] = max;

        System.out.println("\n");
        System.out.println("Максимальный отрицательный элемент массива = " + max);
        System.out.println("Индекс элемент массива = " + maxInd);

        System.out.println("\n");
        System.out.println("Минимальный положительный элемент массива = " + min);
        System.out.println("Индекс элемент массива = " + minInd);

        System.out.println("\n");
        System.out.println("Меняем местами элементы массива");

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}
