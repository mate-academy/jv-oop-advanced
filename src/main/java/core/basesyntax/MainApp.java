package core.basesyntax;

import figures.Figure;
import java.util.Random;
import suppliers.FigureSupplier;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(10)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
