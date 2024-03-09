package PicnicAnalyzer;

import PicnicAnalyzer.controller.PicnicController;
import PicnicAnalyzer.model.PicnicModel;
import PicnicAnalyzer.view.PicnicView;

public class Main {
    public static void main(String[] args) {
        String filePath = "input.txt";

        // Создание экземпляров Model, View и Controller
        PicnicModel model = new PicnicModel(filePath);
        PicnicView view = new PicnicView();
        PicnicController controller = new PicnicController(model);

        // Выполнение операций и вывод результатов
        controller.processPicnic();
    }
}