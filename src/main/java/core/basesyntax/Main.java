package core.basesyntax;

import java.util.Random;

public class Main {
    static final int size_array = 5;

    public static void main(String[] args) {
        int numberOfFigures = new Random().nextInt(size_array);
        Figure[] figures = new Figure[numberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < numberOfFigures; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}
