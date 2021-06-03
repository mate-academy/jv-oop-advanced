package core.basesyntax;

import java.util.Random;

public class MainApp {
    public static final int UPPER_BOUND = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(UPPER_BOUND)];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
