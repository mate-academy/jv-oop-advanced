package core.basesyntax;

import figures.Figure;
import java.util.Random;
import suppliers.FigureSupplier;

public class MainApp {
    private static final int MAX_NUMBER_OF_FIGURES = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(MAX_NUMBER_OF_FIGURES)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
