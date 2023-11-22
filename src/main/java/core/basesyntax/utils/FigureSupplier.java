package core.basesyntax.utils;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RADIUS = 5;
    private static final int MAX_LENGTH = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private double getRandomLength() {
        return random.nextDouble() * MAX_LENGTH;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(getRandomLength(), color);
            case 1:
                return new Rectangle(getRandomLength(), getRandomLength(), color);
            case 2:
                return new RightTriangle(getRandomLength(), getRandomLength(), color);
            case 3:
                return new Circle(getRandomLength(), color);
            default:
                return new IsoscelesTrapezoid(getRandomLength(), getRandomLength(),
                    getRandomLength(), color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, Color.WHITE.name());
    }
}

