package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int RandomFiguresCount = 10;
        FigureSupplier figureSupplier = new FigureSupplier();
        int countOfFigures = new Random().nextInt(RandomFiguresCount);
        Figure[] figures = new Figure[countOfFigures];

        for (int i = 0; i < countOfFigures; i++) {
            figures[i] = figureSupplier.get();
            figures[i].draw();
        }
    }
}
