package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Figure figurePrototype = new FigureSupplier().getRandomFigure();
        int arraySize = random.nextInt(20) + 1;
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
