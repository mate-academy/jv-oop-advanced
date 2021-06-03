package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;

    public Figure getRandomFigure() {
        switch (new Random().nextInt(MAXFIGURES)) {
            case 0:
                return new Circle();
            case 1:
                return new IsoscelesTrapezoid();
            case 2:
                return new Rectangle();
            case 3:
                return new RightTriangle();
            case 4:
            default:
                return new Square();
        }
    }
}
