package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

import java.util.Random;

public class Main extends FigureSupplier {
    public static void main(String[] args) {
        Figure[] figures = new Figure[randInts(1,20)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = getRandomFigure();
            figures[i].draw();
        }
    }

    public static int randInts(int min, int max) {
        return 1 + (100 - 1) * (new Random().nextInt());
    }
}
