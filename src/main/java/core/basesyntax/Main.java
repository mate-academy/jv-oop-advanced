package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[11];
        figures[0] = figureSupplier.getDefaultFigure();
        Random random = new Random();
        for (int i = 1; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure(random.nextInt(5));
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
