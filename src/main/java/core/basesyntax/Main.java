package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];

        for (Figure randomFigure : figures) {
            randomFigure = new FigureSupplier().get();
            randomFigure.drawFigure();
        }
    }
}
