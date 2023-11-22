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
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(getRandomLength(), color);
            case 1:
                return new Rectangle(randomAreaProperty, randomAreaPropertySecond, color);
            case 2:
                return new RightTriangle(randomAreaProperty, randomAreaPropertySecond, color);
            case 3:
                return new Circle(randomAreaProperty, color);
            default:
                return new IsoscelesTrapezoid(randomAreaProperty, randomAreaPropertySecond,
                    randomAreaPropertyThird, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}

