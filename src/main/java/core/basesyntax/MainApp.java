package core.basesyntax;

import java.util.Random;

public class MainApp {
    private static final int NUMBER_OF_FIGURES = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(NUMBER_OF_FIGURES)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }

}
