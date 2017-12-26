package Week4.Task6;

import java.io.*;
import java.util.*;

/**
 * Есть входной файл с набором слов, написанных через пробел
 Необходимо:
 Прочитать слова из файла.
 Отсортировать в алфавитном порядке.
 Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
 Найти слово с максимальным количеством повторений.
 Вывести на консоль это слово и сколько раз оно встречается в файле
 */

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        //Прочитать слова из файла.

        Scanner in = new Scanner(new File("src/main/java/Week4/Task6/File.txt"));
        String string = in.nextLine();
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<String, Integer>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }

        // Отсортировать в алфавитном порядке.
        List<String> mapValues = new ArrayList<String>(wordToCount.keySet());
        Collections.sort(mapValues);
        System.out.println("Отсортированный список:");
        for (String sortWords: mapValues)
            System.out.println(sortWords);

        //Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
        System.out.println("Статистика повторений:");
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }

        //Найти слово с максимальным количеством повторений.
        HashMap.Entry <String, Integer> maxEntry = null;
        for (HashMap.Entry<String, Integer> entry : wordToCount.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println("Слово с максимальным количеством повторений = количество повторений:");
        System.out.println(maxEntry);


    }
}