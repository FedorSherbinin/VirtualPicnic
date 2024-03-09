package PicnicAnalyzer.view;

import java.util.Map;

public class PicnicView {
    public void displayResults(int wordCount, String longestWord, Map<String, Integer> wordFrequency) {
        System.out.println("Количество слов в файле: " + wordCount);
        System.out.println("Самое длинное слово в файле: " + longestWord);
        System.out.println("Частота слов в файле:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}