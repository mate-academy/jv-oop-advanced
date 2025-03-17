package core.basesyntax;

import core.basesyntax.figures.*;


import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int rnd = new Random().nextInt(4)+1;

        return switch (rnd) {
            case 1 -> new Circle();
            case 2 -> new IsoscelesTrapezoid();
            case 3 -> new RightTriangle();
            case 4 -> new Rectangle();
            default -> new Square();
        };
    }

    public Figure getDefaultFigure() {

        return new Circle("white", 10);
    }
}
