package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = 10;
        Figure[] figures = new Figure[random.nextInt(arrayLength)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
