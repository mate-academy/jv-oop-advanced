package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberOfFigures = new Random().nextInt(10);
        Figure[] figures = new Figure[numberOfFigures];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
            figures[i].draw();
        }
    }
}
