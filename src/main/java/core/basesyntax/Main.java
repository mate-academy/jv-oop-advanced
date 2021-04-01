package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_LENGTH = 100;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(MAX_LENGTH)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getFigure();
        }
        
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
