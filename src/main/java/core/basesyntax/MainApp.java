package core.basesyntax;

import java.util.ArrayList;
import java.util.Random;

public class MainApp {
    private FigureSupplier figureSupplier = new FigureSupplier();
    private Random random = new Random();

    public ArrayList getListFigures() {
        int randomNum = random.nextInt(5);
        ArrayList<Figure> listFigures = new ArrayList<>();
        for (int i = 0; i <= randomNum; i++) {
            listFigures.add(figureSupplier.getRandomFigure());
        }
        return listFigures;
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        ArrayList<Figure> figures = new ArrayList<>();
        figures = mainApp.getListFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
