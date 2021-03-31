package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int MAX = 12;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(MAX)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.randomFigure();
        }

        for (Figure res : figures) {
            res.drawFigure();
        }
    }
}
