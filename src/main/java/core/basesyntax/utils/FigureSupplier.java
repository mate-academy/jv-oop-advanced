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
        double randomAreaProperty = random.nextDouble() * 10 + 1;
        double randomAreaPropertySecond = random.nextDouble() * 10 + 1;
        double randomAreaPropertyThird = random.nextDouble() * 10 + 1;
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 0:
                return new Square(randomAreaProperty, color);
            case 1:
                return new Rectangle(randomAreaProperty, randomAreaPropertySecond, color);
            case 2:
                return new RightTriangle(randomAreaProperty, randomAreaPropertySecond, color);
            case 3:
                return new Circle(randomAreaProperty, color);
            case 4:
            default:
                return new IsoscelesTrapezoid(randomAreaProperty, randomAreaPropertySecond,
                    randomAreaPropertyThird, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}

