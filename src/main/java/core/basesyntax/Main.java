package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int RANGE = 10;

    public static void main(String[] args) {

        Figure[] figures = new Figure[new Random().nextInt(RANGE)];

        for (Figure randomFigure : figures) {
            randomFigure = new FigureSupplier().get();
            randomFigure.drawFigure();
        }
    }
}
