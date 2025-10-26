package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private double getRandomNumber() {
        return random.nextInt(1, 20);
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        double side = getRandomNumber();

        if (figureType == 0) {
            return new Square(side, color);
        }
        if (figureType == 1) {
            return new Circle(side, color);
        }
        if (figureType == 2) {
            return new IsoscelesTrapezoid(side, side, side,
                    color);
        }
        if (figureType == 3) {
            return new Rectangle(side, side, color);
        }
        if (figureType == 4) {
            return new RightTriangle(side, side, color);
        }

        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name().toLowerCase());
    }
}
