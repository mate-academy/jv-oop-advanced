package core.basesyntax.main;

import core.basesyntax.figure.Figure;
import java.util.Random;

public class Main {
    public static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int arraySize = new Random().nextInt(MAX_ARRAY_SIZE);
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure: figures) {
            System.out.println(figure.draw());
        }
    }
}
