package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = new Random().nextInt(10);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[length];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
