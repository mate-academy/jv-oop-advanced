package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_FIGURES = 5;

    public Figure getRandomFigure() {
        var randomFigure = new Random().nextInt(MAX_FIGURES);
        switch (randomFigure) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Rectangle();
            case 3:
                return new RightTriangle();
            default:
                return new IsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
