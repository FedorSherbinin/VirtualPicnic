package PicnicAnalyzer.controller;

import PicnicAnalyzer.model.PicnicModel;

import java.io.IOException;
import java.util.Map;

public class PicnicController {
    private PicnicModel model;

    public PicnicController(PicnicModel model) {
        this.model = model;
    }

    public void processPicnic() {
        try {
            // Задание 1.md
            int wordCount = model.countWords();
            System.out.println("Задание 1.md");
            System.out.println("Количество слов в файле: " + wordCount);
            System.out.println();

            // Задание 2
            String longestWord = model.findLongestWord();
            System.out.println("Задание 2");
            System.out.println("Самое длинное слово в файле: " + longestWord);
            System.out.println();

            // Задание 3
            Map<String, Integer> wordFrequency = model.calculateWordFrequency();
            System.out.println("Задание 3");
            System.out.println("Частота слов в файле:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}