package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();

//    public Figure getRandomFigure() {
//
//    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(),10);
    }
}
